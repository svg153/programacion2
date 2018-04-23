# NOTA PARA USUARIOS WINDOWS: usad ";" en vez de ":" como separador de
# "paths" y usad "\" en vez de "/" como separador de directorios.

# Para compilar todo:
compile:
	mkdir -p bin
	javac -d bin -cp src:CorrectorOffline.jar:Fecha.jar:junit-4.12.jar:hamcrest-core-1.3.jar src/ee1/*.java src/*.java src/test/*.java


# Para ejecutar TestLectorAlum
runTestLectorAlum: compile
	java -cp bin:CorrectorOffline.jar:Fecha.jar:junit-4.12.jar:hamcrest-core-1.3.jar TestLectorAlum

# Para ejecutar TestLibroAlum
runTestLibroAlum: compile
	java -cp bin:CorrectorOffline.jar:Fecha.jar:junit-4.12.jar:hamcrest-core-1.3.jar TestLibroAlum

# Para ejecutar test junit
testLibro: compile
	java -cp bin:CorrectorOffline.jar:Fecha.jar:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore test.TestLibro

testLector: compile
	java -cp bin:CorrectorOffline.jar:Fecha.jar:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore test.TestLector

