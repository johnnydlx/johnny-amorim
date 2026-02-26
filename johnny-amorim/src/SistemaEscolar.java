public class SistemaEscolar {


    private String nomeAluno;
    private double[] notas;
    private String nomeProfessor;
    private String disciplina;
    private String sala;
    private int cargaHoraria;

    public double calcularMedia() {
        double soma = 0;
        for (double n : notas) {
            soma += n;
        }
        return soma / notas.length;
    }

    public boolean alunoAprovado() {
        return calcularMedia() >= 7;
    }

    public void imprimirBoletim() {
        System.out.println("Aluno: " + nomeAluno);
        System.out.println("Professor: " + nomeProfessor);
        System.out.println("Disciplina: " + disciplina);
        System.out.println("Sala: " + sala);
        System.out.println("Média: " + calcularMedia());
    }
}

