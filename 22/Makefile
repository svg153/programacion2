# NOTA PARA USUARIOS WINDOWS: usad ";" en vez de ":" como separador de
# "paths" y usad "\" en vez de "/" como separador de directorios.

# Para compilar todo:
compile:
	# Crear el direction bin si no está creado
	mkdir -p bin
	# Compilar todo el código fuente
	javac -Xlint:unchecked -d bin -cp junit-4.12.jar:hamcrest-core-1.3.jar src/g1mb/*/*.java

# Para ejecutar test junit
tests: testList testStack testQueue

testList: compile
	java -cp bin:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore g1mb.tests.ListTests

testStack: compile
	java -cp bin:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore g1mb.tests.StackTests

testQueue: compile
	java -cp bin:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore g1mb.tests.QueueTests
