# CMAKE generated file: DO NOT EDIT!
# Generated by "MinGW Makefiles" Generator, CMake Version 3.17

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Disable VCS-based implicit rules.
% : %,v


# Disable VCS-based implicit rules.
% : RCS/%


# Disable VCS-based implicit rules.
% : RCS/%,v


# Disable VCS-based implicit rules.
% : SCCS/s.%


# Disable VCS-based implicit rules.
% : s.%


.SUFFIXES: .hpux_make_needs_suffix_list


# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

SHELL = cmd.exe

# The CMake executable.
CMAKE_COMMAND = C:\CLion-2020.3.2\bin\cmake\win\bin\cmake.exe

# The command to remove a file.
RM = C:\CLion-2020.3.2\bin\cmake\win\bin\cmake.exe -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = "C:\Matrix Multiplication"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "C:\Matrix Multiplication\cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/Matrix_Multiplication.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/Matrix_Multiplication.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Matrix_Multiplication.dir/flags.make

CMakeFiles/Matrix_Multiplication.dir/main.c.obj: CMakeFiles/Matrix_Multiplication.dir/flags.make
CMakeFiles/Matrix_Multiplication.dir/main.c.obj: ../main.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="C:\Matrix Multiplication\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/Matrix_Multiplication.dir/main.c.obj"
	C:\PROGRA~1\CODEBL~1\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles\Matrix_Multiplication.dir\main.c.obj   -c "C:\Matrix Multiplication\main.c"

CMakeFiles/Matrix_Multiplication.dir/main.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Matrix_Multiplication.dir/main.c.i"
	C:\PROGRA~1\CODEBL~1\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E "C:\Matrix Multiplication\main.c" > CMakeFiles\Matrix_Multiplication.dir\main.c.i

CMakeFiles/Matrix_Multiplication.dir/main.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Matrix_Multiplication.dir/main.c.s"
	C:\PROGRA~1\CODEBL~1\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S "C:\Matrix Multiplication\main.c" -o CMakeFiles\Matrix_Multiplication.dir\main.c.s

# Object files for target Matrix_Multiplication
Matrix_Multiplication_OBJECTS = \
"CMakeFiles/Matrix_Multiplication.dir/main.c.obj"

# External object files for target Matrix_Multiplication
Matrix_Multiplication_EXTERNAL_OBJECTS =

Matrix_Multiplication.exe: CMakeFiles/Matrix_Multiplication.dir/main.c.obj
Matrix_Multiplication.exe: CMakeFiles/Matrix_Multiplication.dir/build.make
Matrix_Multiplication.exe: CMakeFiles/Matrix_Multiplication.dir/linklibs.rsp
Matrix_Multiplication.exe: CMakeFiles/Matrix_Multiplication.dir/objects1.rsp
Matrix_Multiplication.exe: CMakeFiles/Matrix_Multiplication.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="C:\Matrix Multiplication\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable Matrix_Multiplication.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\Matrix_Multiplication.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Matrix_Multiplication.dir/build: Matrix_Multiplication.exe

.PHONY : CMakeFiles/Matrix_Multiplication.dir/build

CMakeFiles/Matrix_Multiplication.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\Matrix_Multiplication.dir\cmake_clean.cmake
.PHONY : CMakeFiles/Matrix_Multiplication.dir/clean

CMakeFiles/Matrix_Multiplication.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" "C:\Matrix Multiplication" "C:\Matrix Multiplication" "C:\Matrix Multiplication\cmake-build-debug" "C:\Matrix Multiplication\cmake-build-debug" "C:\Matrix Multiplication\cmake-build-debug\CMakeFiles\Matrix_Multiplication.dir\DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/Matrix_Multiplication.dir/depend
