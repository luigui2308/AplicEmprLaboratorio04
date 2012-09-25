PATH=C:\Program Files\Java\jdk1.6.0_25\bin

:: Domain 
javac -d universidad/WEB-INF/classes src/domain/Profesor.java src/domain/ProfesorFactory.java src/domain/ProfesorRepository.java

:: Display
javac -cp "universidad/WEB-INF/classes";"universidad/WEB-INF/lib/*" -d universidad/WEB-INF/classes src/display/PageController.java src/display/ActualizarProfesor.java src/display/DetalleProfesor.java src/display/ListaProfesores.java src/util/ProfesorAssembler.java src/util/ProfesorDTO.java

:: Data
javac -cp "universidad/WEB-INF/classes";"universidad/WEB-INF/lib/*" -d universidad/WEB-INF/classes src/data/ProfesorRepositoryDAOImpl.java src/data/ProfesorDAO.java

:: Dialect
javac -cp "universidad/WEB-INF/classes";"universidad/WEB-INF/lib/*" -d universidad/WEB-INF/classes src/dialect/SQLiteDialect.java

pause
