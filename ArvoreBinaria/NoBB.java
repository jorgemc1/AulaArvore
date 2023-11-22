package ArvoreBinaria;

/**
 *
 * @author Jorge Maestre Carvalho
 */
public class NoBB {
    private int valor;
    private NoBB esquerda;
    private NoBB direita;
    
    //Construtor
    NoBB(int valor){
        this.valor = valor;
        this.esquerda = esquerda;
        this.direita = direita;
    }
    
    public static void montaArvore(NoBB novo, NoBB arvore){
     if(arvore == null){
         arvore = novo;
     }else{//Adiciona valores a esquerda da árvore.
         if(novo.valor < arvore.valor){
             //Verificando se tem filhos a esquerda.
             if(arvore.esquerda == null){
                 arvore.esquerda = novo;
             }else{
                 montaArvore(novo, arvore.esquerda);
             }
         }else{//Adiciona valores a direita da árvore.
             //Verificando se tem filhos a direita.
             if(arvore.direita == null){
                 arvore.direita = novo;                
             }else{
                 montaArvore(novo, arvore.direita);
             }
         }
     }
    }
    
    //IMPRIMIR EM PRÉ ORDEM.
    public static void imprimirPreOrdem(NoBB n){
        System.out.print(n.valor + " ");
        if(n.esquerda != null){
            imprimirPreOrdem(n.esquerda);
        }
        if(n.direita != null){
            imprimirPreOrdem(n.direita);
        }
    }
    
    //IMPRIMIR EM ORDEM.
    public static void imprimirEmOrdem(NoBB n){
       if(n.esquerda != null){
           imprimirEmOrdem(n.esquerda);
       } 
       System.out.print(n.valor + " ");
       if(n.direita != null){
           imprimirEmOrdem(n.direita);
       }
    }
    
    //MÉTODO DE BUSCA.
    public static boolean buscaNo(NoBB arvore,int valor){
        boolean ret = false;
        if(arvore == null){//NÃO ACHOU O NÓ.
            ret = false;
        }else if(arvore.valor == valor){//ACHOU O NÓ NA ÁRVORE.
            ret = true;
        }else{
            if(arvore.valor > valor){
                ret = buscaNo(arvore.esquerda, valor);
            }else{
                ret = buscaNo(arvore.direita, valor);
            }
        }
        return ret;
    }
    
    
    //IMPRIMIR EM PÓS ORDEM.
    public static void imprimirPosOrdem(NoBB n){
        if(n.esquerda != null){
            imprimirPosOrdem(n.esquerda);
        }
        if(n.direita != null){
            imprimirPosOrdem(n.direita);
        }
        System.out.print(n.valor + " ");
    }
}