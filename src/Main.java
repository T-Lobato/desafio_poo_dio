import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThyago = new Dev();
        devThyago.setNome("Thyago");
        devThyago.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Thyago:" + devThyago.getConteudosInscritos());
        devThyago.progredir();
        devThyago.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Thyago:" + devThyago.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Thyago:" + devThyago.getConteudosConcluidos());
        System.out.println("XP:" + devThyago.calcularTotalXp());

        System.out.println("-------");

        Dev devPaola = new Dev();
        devPaola.setNome("Paola");
        devPaola.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Paola:" + devPaola.getConteudosInscritos());
        devPaola.progredir();
        devPaola.progredir();
        devPaola.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Paola:" + devPaola.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos Paola:" + devPaola.getConteudosConcluidos());
        System.out.println("XP:" + devPaola.calcularTotalXp());
    }
}