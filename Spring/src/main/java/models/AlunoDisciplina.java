package models;

import dtos.AlunoDisciplinaDTO;

public class AlunoDisciplina {

    private Disciplina disciplina;
    private double nota;

    public AlunoDisciplina() {
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public AlunoDisciplinaDTO converteParaDTO() {
        return null;
    }

}