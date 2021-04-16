import java.awt.*;
import java.util.*;


interface IPlayersFinder {

     Point[] findPlayers(String[] photo, int team, int threshold);
}


public class PlayersFinder implements IPlayersFinder {
int max_x,max_y,min_x,min_y;
    public boolean check_valid(String[] photo,int i,int j, int team){

        return 0 <= i && i < photo.length && 0 <= j && j < photo[0].length() && photo[i].charAt(j) == Character.forDigit(team, 10);
    }
    public int collect_size(String[] photo, int team, int i,int j,int block_size){

        if(new PlayersFinder().check_valid(photo,i+1,j,team)) {
            if(i+1 > max_y) {
                max_y = i + 1;
            }
            block_size+=4;
            photo[i+1]=photo[i+1].substring(0,j)+'e'+photo[i+1].substring(j+1);
            block_size=collect_size(photo,team,i+1,j,block_size);

        }
        if(new PlayersFinder().check_valid(photo,i,j+1,team)) {
            if(j+1>max_x) {
                max_x = j + 1;
            }
            block_size+=4;
            photo[i]=photo[i].substring(0,j+1)+'e'+photo[i].substring(j+2);
            block_size=collect_size(photo,team,i,j+1,block_size);
        }
        if(new PlayersFinder().check_valid(photo,i-1,j,team)) {
            if(i-1<min_y) {
                min_y = i - 1;
            }
            block_size+=4;
            photo[i-1]=photo[i-1].substring(0,j)+'e'+photo[i-1].substring(j+1);
            block_size=collect_size(photo,team,i-1,j,block_size);
        }
        if(new PlayersFinder().check_valid(photo,i,j-1,team)) {
            if(j-1<min_x) {
                min_x = j - 1;
            }
            block_size+=4;
            photo[i]=photo[i].substring(0,j-1)+'e'+photo[i].substring(j);
            block_size=collect_size(photo,team,i,j-1,block_size);
        }
        return block_size;
    }
    public Point[] findPlayers(String[] photo, int team, int threshold) {
        Point[] blocks =new Point[51];
        int counter =0;
        int block_size;
        for(int i = 0 ; i < photo.length ; i++){
            for(int j = 0 ; j < photo[0].length() ; j++){
                if(new PlayersFinder().check_valid(photo,i,j,team)){
                    photo[i]=photo[i].substring(0,j)+'e'+photo[i].substring(j+1);
                    max_x=j;
                    min_x=j;
                    max_y=i;
                    min_y=i;
                    block_size=4;
                    if(collect_size(photo,team,i,j,block_size) >= threshold){
                        blocks[counter]=new Point(max_x+min_x+1,max_y+min_y+1);

                        counter++;
                    }

                }
            }
        }
        blocks[counter]=new Point(-1,-1);
        return  blocks;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sin = sc.nextLine().replaceAll("[\\[\\]]", "");
        String[] s = sin.split(", ");
        int n = Integer.parseInt(s[0]);
        String [] photo = new String[n];
        for(int i=0 ;i<n ; i++){
            photo[i] = sc.nextLine();
        }
        int team = sc.nextInt();
        int threshold = sc.nextInt();
        Point[] temp = new PlayersFinder().findPlayers(photo,team,threshold);
        Point carry;
        for(int c=0;temp[c].x != -1;c++){
            for(int d=0;temp[d+1+c].x != -1;d++){
                if(temp[d].x>temp[d+1].x){
                    carry=temp[d];
                    temp[d]=temp[d+1];
                    temp[d+1]=carry;
                }
            }
        }
        System.out.print("[");
        for (int i = 0; temp[i].x != -1; i++) {
            if (temp[i+1].x != -1) {
                System.out.print("(" + temp[i].x + ", " + temp[i].y + ")" + ", ");
            } else {
                System.out.print("(" + temp[i].x + ", " + temp[i].y + ")");
            }
        }
        System.out.print("]");

    }
}



