public class GerenciamentoCursos {
    public static void main(String[] args) {

        Curso cursoJava = new Curso("Java", "CS101", 6);
        Curso cursoPython = new Curso("Python", "CS102", 5);

        Estudante estudante1 = new Estudante("Julio", "2021001");
        Estudante estudante2 = new Estudante("Maria", "2021002");

        cursoJava.matricularEstudante(estudante1);
        cursoJava.matricularEstudante(estudante2);
        cursoPython.matricularEstudante(estudante1);

        cursoJava.listarEstudantes();
        cursoPython.listarEstudantes();
    }
}
