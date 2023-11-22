package ArvoreBinaria;

/**
 *
 * @author Jorge Maestre Carvalho.
 */
public class TesteApp {
    public static void main(String args[]){
        NoBB arvore = new NoBB(10);
        NoBB.montaArvore(arvore,null);
        
        NoBB n5 = new NoBB(5);
        NoBB.montaArvore(n5, arvore);
        
        NoBB n20 = new NoBB(20);
        NoBB.montaArvore(n20, arvore);
        
        NoBB n33 = new NoBB(33);
        NoBB.montaArvore(n33, arvore);
        
        NoBB n1 = new NoBB(1);
        NoBB.montaArvore(n1, arvore);
        
        NoBB n2 = new NoBB(2);
        NoBB.montaArvore(n2, arvore);
        
        NoBB n7 = new NoBB(7);
        NoBB.montaArvore(n7, arvore);
        
        NoBB n30 = new NoBB(30);
        NoBB.montaArvore(n30, arvore);
                        
        //SAIDA
        //EM PRÉ ORDEM.
        System.out.println("EM PRE ORDEM");
        NoBB.imprimirPreOrdem(arvore);
        //EM ORDEM
        System.out.println("\nEM ORDEM");
        NoBB.imprimirEmOrdem(arvore);
        //EM POS ORDEM
        System.out.println("\nEM POS ORDEM");
        NoBB.imprimirPosOrdem(arvore);
        System.out.println("");
        
        //BUSCANDO UM VALOR.
        System.out.println(NoBB.buscaNo(arvore, 2));
        
    }
}
