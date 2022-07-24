import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        //System.out.println(curso1);
        
        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);
        //System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());
        //System.out.println(mentoria);


        /* Exemplo de Polimorfismo:
        Conteudo conteudo = new Curso();
        Conteudo conteudo1 = new Mentoria(); */

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Santander Code Girls");
        bootcamp.setDescricao("Descrição Bootcamp Santander Code Girls");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devStephanie = new Dev();
        devStephanie.setNome("Stephanie");
        devStephanie.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Stephanie:" + devStephanie.getConteudosInscritos());
        devStephanie.progredir();
        devStephanie.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Stephanie:" + devStephanie.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Stephanie:" + devStephanie.getConteudosConcluidos());
        System.out.println("XP: " + devStephanie.calcularTotalXp());

        System.out.println("-----------");

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Maria:" + devMaria.getConteudosInscritos());
        devMaria.progredir();
        devMaria.progredir();
        devMaria.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Maria:" + devMaria.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Maria:" + devMaria.getConteudosConcluidos());
        System.out.println("XP: " + devMaria.calcularTotalXp());
    }
}