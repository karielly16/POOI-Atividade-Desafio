public class SQLFactory{
    public static void main(String[] args){

        Alunos eu = new Alunos();

        Database.abrirID(eu, 18);
        System.out.println("Nome: " + eu.nome + ", Idade: " + eu.idade + ", Cidade: " + eu.cidade + ", UF" + eu.uf );
        
    }

}



    //eu.id = 2;
    // eu.nome = "Ste";
    // eu.idade = 18;
    // eu.cidade = "Pará";
    // eu.uf = "PA";

    //  if (Database.abrir(aluno, 1)) {
    //   System.out.println(aluno.nome);
    // }
    //pilha.id = 1;
    // pilha.filial_id = 2;
    ////pilha.produto_id = 42; 
    //pilha.quantidade = 1900;

    // Database.inserir(pilha);
    // Database.atualizar(pilha);
    //Database.deletar(pilha);
    // Database.abrir(pilha);

       //System.out.println("-------SELECT-------");
       //System.out.println(pilha.selectSQL());
       //System.out.println("-------INSERT-------");
       //System.out.println(pilha.insertSQL());
       //System.out.println("-------UPDATE-------");
       //System.out.println(pilha.updateSQL());
       //System.out.println("-------DELETE-------");
       //System.out.println(pilha.deleteSQL());