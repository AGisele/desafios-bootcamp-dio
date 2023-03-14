import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso JS");
        curso2.setDescricao("Descrição curso JS");
        curso2.setCargaHoraria(4);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria de Java");
        mentoria1.setDescricao("Descrição mentoria Java");
        mentoria1.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devGisele = new Dev();
        devGisele.setNome("Gisele");
        devGisele.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devGisele.getConteudosInscritos());
        devGisele.progredir();
        devGisele.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devGisele.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devGisele.getConteudosConcluidos());
        System.out.println("XP: " +devGisele.calcularTotalXp());

        System.out.println("-----------");

        Dev devJenna = new Dev();
        devJenna.setNome("Jenna");
        devJenna.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devJenna.getConteudosInscritos());
        devJenna.progredir();
        devGisele.progredir();
        devGisele.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos" + devJenna.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devJenna.getConteudosConcluidos());
        System.out.println("XP: "+devJenna.calcularTotalXp());

    }
}