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
CMAKE_SOURCE_DIR = "C:\ Count the Words"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "C:\ Count the Words\cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/_Count_the_Words.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/_Count_the_Words.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/_Count_the_Words.dir/flags.make

CMakeFiles/_Count_the_Words.dir/main.c.obj: CMakeFiles/_Count_the_Words.dir/flags.make
CMakeFiles/_Count_the_Words.dir/main.c.obj: ../main.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="C:\ Count the Words\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/_Count_the_Words.dir/main.c.obj"
	C:\PROGRA~1\CODEBL~1\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles\_Count_the_Words.dir\main.c.obj   -c "C:\ Count the Words\main.c"

CMakeFiles/_Count_the_Words.dir/main.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/_Count_the_Words.dir/main.c.i"
	C:\PROGRA~1\CODEBL~1\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E "C:\ Count the Words\main.c" > CMakeFiles\_Count_the_Words.dir\main.c.i

CMakeFiles/_Count_the_Words.dir/main.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/_Count_the_Words.dir/main.c.s"
	C:\PROGRA~1\CODEBL~1\MinGW\bin\gcc.exe $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S "C:\ Count the Words\main.c" -o CMakeFiles\_Count_the_Words.dir\main.c.s

# Object files for target _Count_the_Words
_Count_the_Words_OBJECTS = \
"CMakeFiles/_Count_the_Words.dir/main.c.obj"

# External object files for target _Count_the_Words
_Count_the_Words_EXTERNAL_OBJECTS =

_Count_the_Words.exe: CMakeFiles/_Count_the_Words.dir/main.c.obj
_Count_the_Words.exe: CMakeFiles/_Count_the_Words.dir/build.make
_Count_the_Words.exe: CMakeFiles/_Count_the_Words.dir/linklibs.rsp
_Count_the_Words.exe: CMakeFiles/_Count_the_Words.dir/objects1.rsp
_Count_the_Words.exe: CMakeFiles/_Count_the_Words.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="C:\ Count the Words\cmake-build-debug\CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable _Count_the_Words.exe"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles\_Count_the_Words.dir\link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/_Count_the_Words.dir/build: _Count_the_Words.exe

.PHONY : CMakeFiles/_Count_the_Words.dir/build

CMakeFiles/_Count_the_Words.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles\_Count_the_Words.dir\cmake_clean.cmake
.PHONY : CMakeFiles/_Count_the_Words.dir/clean

CMakeFiles/_Count_the_Words.dir/depend:
	$(CMAKE_COMMAND) -E cmake_depends "MinGW Makefiles" "C:\ Count the Words" "C:\ Count the Words" "C:\ Count the Words\cmake-build-debug" "C:\ Count the Words\cmake-build-debug" "C:\ Count the Words\cmake-build-debug\CMakeFiles\_Count_the_Words.dir\DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/_Count_the_Words.dir/depend

