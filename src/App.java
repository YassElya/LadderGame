import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int nbÉchelle=0;
        double hauteur=0;
        double moyenne;
        Scanner sc=new Scanner(System.in);
        
        System.out.println("choisissez la largeur de l'échelle de 1 à 50. (0 Pour terminer)");
        int larg=sc.nextInt();
        while(larg<0 || larg>50){
            System.out.println("Réessayer encore une fois. Rappel: de 1 à 50 et 0 pour terminer.");
            larg=sc.nextInt();
        }
        while(larg==0){
                System.out.println("Aucune échelle produite.");
                return;
        }
        System.out.println("choisissez l'interval entre les barreaux de 1 à 10.");
        int intval=sc.nextInt();
        while(intval<1 || intval>10){
        System.out.println("Réessayer encore une fois. Rappel: de 1 à 10");
        intval=sc.nextInt();
        }
        System.out.println("choisissez le nombre de barreaux de 1 à 20.");
        int barr=sc.nextInt();
        while(barr<1 || barr>20){
            System.out.println("Réessayer encore une fois. Rappel: de 1 à 20");
            barr=sc.nextInt();
        }

        
        do{
            //bouts de l'échelle en haut
            for(int a=0;a<intval/2;a++){
            System.out.print("||");
            for(int i=0;i<larg;i++){
                System.out.print(" ");
            }
            System.out.print("||\n");
            }
            hauteur+=intval/2;
            //Barreau
            for(int v=1;v<=barr;v++){
                    System.out.print("||");
                    int lg=0;
                    while(lg<larg){
                        if(lg%2==0){
                        System.out.print("=");
                        }
                        if(lg%2==1){
                        System.out.print("*");
                        }
                        lg++;
                    }
                System.out.print("||\n");
                hauteur+=1;
                if(v!=barr){
                    for(int d=0;d<intval;d++){
                        System.out.print("||");
                        for(int i=0;i<larg;i++){
                        System.out.print(" ");
                        }
                        System.out.print("||\n");
                        hauteur+=1;
                    }
                }
            }
                //Bouts en bas
                for(int a=0;a<intval/2;a++){
                System.out.print("||");
                for(int i=0;i<larg;i++){
                    System.out.print(" ");
                }
                System.out.print("||\n");
                }
                hauteur+=intval/2;
                nbÉchelle++;
                moyenne=hauteur/nbÉchelle;
            
                System.out.println("Voulez-vous continuer?");
                System.out.println("Si oui, entrez la largeur de l'échelle que vous voulez fabriquer.");
                System.out.println("Sinon, écrivez 0.");
                larg=sc.nextInt();
                while(larg<0 || larg>50){
                    System.out.println("Réessayer encore une fois. Rappel: de 1 à 50 et 0 pour terminer.");
                    larg=sc.nextInt();
                }
                if(larg==0){
                    System.out.println("Nombre d'échelle produite est: "+nbÉchelle);
                    if(nbÉchelle<=1){
                        System.out.println("La hauteur moyenne de l'échelles est: "+moyenne);
                    }else{
                        System.out.println("La hauteur moyenne des "+nbÉchelle+" échelles est: "+moyenne);
                    }
                }else{
                    System.out.println("Intervale désiré (1 à 10).");
                    intval=sc.nextInt();
                    while(intval<1 || intval>10){
                        System.out.println("Réessayer encore une fois. Rappel: de 1 à 10");
                        intval=sc.nextInt();
                    }
                    System.out.println("nombre de barreaux désiré (1 à 20).");
                    barr=sc.nextInt();
                    while(barr<1 || barr>20){
                        System.out.println("Réessayer encore une fois. Rappel: de 1 à 20");
                        barr=sc.nextInt();
                    }
                }
        }while(larg!=0);
        }
    }
