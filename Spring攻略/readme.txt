===============================================================================
                    SPRING RECIPES - SOURCE CODE README FILE
===============================================================================

-------------------------------------------------------------------------------
INTRODUCTION
-------------------------------------------------------------------------------

The source code for Spring Recipes is organized by chapters, each of which
includes one or more independent Eclipse projects.


-------------------------------------------------------------------------------
SETTING UP THE CODE
-------------------------------------------------------------------------------

The Eclipse projects assume that you have installed the Spring framework and
other utilities to the root of the C: drive (e.g., C:/spring-framework-2.5). If
you have them installed in other locations, you need to configure the locations
explicitly in Java Build Path -> Libraries. For web projects, you have to copy
the required JAR files, as instructed in the book, to the WEB-INF/lib directory.


-------------------------------------------------------------------------------
RUNNING THE CODE
-------------------------------------------------------------------------------

For standard Java projects, simply run the main classes as Java applications.
For web projects, you have to deploy them to a web container, such as Apache
Tomcat.
