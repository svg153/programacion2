# NOTA PARA USUARIOS WINDOWS: usad ";" en vez de ":" como separador de
# "paths" y usad "\" en vez de "/" como separador de directorios.

# Para compilar todo:
compile:
	# Crear el direction bin si no está creado
	mkdir -p bin
	# Compilar todo el código fuente
	javac -d bin -cp src:tads1617_2.jar:CorrectorOffline.jar:junit-4.12.jar:hamcrest-core-1.3.jar src/gestionpedidos/*.java src/gestionpedidos/mapa/*.java src/gestionpedidos/pedido/*.java src/gestionpedidos/transportes/*.java src/test/*.java


# Para ejecutar tests jUnit de GestionRepartoLocal
testGestionRepartoLocal: compile
	java -cp bin:tads1617_2.jar:CorrectorOffline.jar:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore test.GestionRepartoLocalJUnitTest

# Para ejecutar tests jUnit de Moto
testMoto: compile
	java -cp bin:tads1617_2.jar:CorrectorOffline.jar:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore test.MotoJUnitTest

# Para ejecutar tests jUnit de Pedido
testPedido: compile
	java -cp bin:tads1617_2.jar:CorrectorOffline.jar:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore test.PedidoJUnitTest
