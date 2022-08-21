import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner leia = new Scanner(System.in);
        //
        //Declaração de variáveis
        byte taxaJuros = 0;
        double seliC = 0, dolar_taxaDeCambioLivreDeVenda = 0, igp_di = 0, igp_m = 0, ipca = 0;
        int cont = 0;

        System.out.println("SIMULAÇÃO DE EMPRÉSTIMO\n");

        System.out.print("Digite seu nome completo: ");
            String nome = leia.nextLine();
        System.out.print("Informe sua renda mensal bruta: R$");
            double rendaBruta = leia.nextDouble();
        System.out.print("Informe o total de suas despesas mensais: R$");
            double despesas = leia.nextDouble();
        System.out.print("Informe o valor do empréstimo que você deseja realizar: R$");
            double valorEmp = leia.nextDouble();
        System.out.print("Agora informe em quantas parcelas mensais você deseja realizar o pagamento: ");
            byte parcelas = leia.nextByte();
        //
        //Processamento dos valores disponívies do cliente
        double rendaLiquida = rendaBruta - despesas;    
        //
        //Menu de selação de taxa de juros    
        do {
            System.out.print("\nSelecione a taxa de juros; \n5 - Selic - Taxa Básica De Juros Da Economia; \n6 - Dólar - Taxa De Câmbio Livre De Venda; \n7 - IGP-DI - Índice Geral de Preços; \n8 - IGP-M - Índ. Geral de Preços De Mercado; \n9 - IPCA - Índ. Preços ao Consumidor Amplo; ");
            System.out.print("\nSelecione uma das taxas informadas: ");
            taxaJuros = leia.nextByte();
        //
        //Menu de selação de taxa de juros
            switch (taxaJuros) {
                case 5:
                    System.out.println("TAXA \"Selic - Básica De Juros Da Economia\" foi selecionada");
                    seliC = valorEmp * parcelas * 0.05079;
                    if (rendaLiquida > seliC) {
                        System.out.println("\n\nStatus: EMPRÉSTIMO APROVADO!\n\nNOME DO CLIENTE: " + nome + "\nRENDA BRUTA: R$" + rendaBruta + "\nRENDA LÍQUIDA: R$" + rendaLiquida + "\nTOTAL DO EMPRÉSTIMO SOLICITADO PELO CLIENTE: R$" + valorEmp + "\nJUROS TOTAIS: R$" + seliC + "\nVALOR TOTAL DO EMPRÉSTIMO COM JUROS: R$" + (valorEmp + seliC) + "\nTAXA SELECIONADA: Selic - Taxa Básica De Juros Da Economia" + "\nTOTAL DE PARCELAS: " + parcelas + "\nLISTA COMPLETA COM AS " + parcelas + " parcelas mais juros optados pelo cliente: \n");
                        //
                        //Exibindo para o usuário as parcelas já com os juros inclusos.
                        for(cont = 1; cont <= parcelas; cont++){
                            System.out.println(cont + "º" + " - VALOR: R$" + (valorEmp + seliC) / parcelas);
                        }
                        System.out.println("SOMA TOTAL DAS PARCELAS: R$" + (valorEmp + seliC));
                    }else{
                        System.out.println("\n\nStatus: EMPRÉSTIMO NÃO APROVADO!\n\nMOTIVO: Renda líquida menor que o valor somado de duas parcelas do empréstimo.\nTente fazer um nova simulação com um valor de empréstimo mais baixo ou que a renda líquida cubra duas parcelas do empréstimo.");
                    }
                    break;
                case 6:
                    System.out.println("TAXA \"Dólar - Taxa De Câmbio Livre De Venda\" foi selecionada");
                    dolar_taxaDeCambioLivreDeVenda = valorEmp * parcelas * 5.1961;
                    if (rendaLiquida > dolar_taxaDeCambioLivreDeVenda) {
                        System.out.println("\n\nStatus: EMPRÉSTIMO APROVADO!\n\nNOME DO CLIENTE: " + nome + "\nRENDA BRUTA: R$" + rendaBruta + "\nRENDA LÍQUIDA: R$" + rendaLiquida + "\nTOTAL DO EMPRÉSTIMO SOLICITADO PELO CLIENTE: R$" + valorEmp + "\nJUROS TOTAIS: R$" + seliC + "\nVALOR TOTAL DO EMPRÉSTIMO COM JUROS: R$" + (valorEmp + dolar_taxaDeCambioLivreDeVenda) + "\nTAXA SELECIONADA: Dólar - Taxa De Câmbio Livre De Venda" + "\nTOTAL DE PARCELAS: " + parcelas + "\nLISTA COMPLETA COM AS " + parcelas + " parcelas mais juros optados pelo cliente: \n");
                        //
                        //Exibindo para o usuário as parcelas já com os juros inclusos.
                        for(cont = 1; cont <= parcelas; cont++){
                            System.out.println(cont + "º" + " - VALOR: R$" + (valorEmp + dolar_taxaDeCambioLivreDeVenda) / parcelas);
                        }
                        System.out.println("SOMA TOTAL DAS PARCELAS: R$" + (valorEmp + dolar_taxaDeCambioLivreDeVenda));
                    }else{
                        System.out.println("\n\nStatus: EMPRÉSTIMO NÃO APROVADO!\n\nMOTIVO: Renda líquida menor que o valor somado de duas parcelas do empréstimo.\nTente fazer um nova simulação com um valor de empréstimo mais baixo ou que a renda líquida cubra duas parcelas do empréstimo.");
                    }
                    break;
                case 7:
                    System.out.println("TAXA \"IGP-DI - Índice Geral de Preços\" foi selecionada");
                    igp_di = valorEmp * parcelas * 0.38;
                    if (rendaLiquida > igp_di) {
                        System.out.println("\n\nStatus: EMPRÉSTIMO APROVADO!\n\nNOME DO CLIENTE: " + nome + "\nRENDA BRUTA: R$" + rendaBruta + "\nRENDA LÍQUIDA: R$" + rendaLiquida + "\nTOTAL DO EMPRÉSTIMO SOLICITADO PELO CLIENTE: R$" + valorEmp + "\nJUROS TOTAIS: R$" + seliC + "\nVALOR TOTAL DO EMPRÉSTIMO COM JUROS: R$" + (valorEmp + igp_di) + "\nTAXA SELECIONADA: IGP-DI - Índice Geral de Preços" + "\nTOTAL DE PARCELAS: " + parcelas + "\nLISTA COMPLETA COM AS " + parcelas + " parcelas mais juros optados pelo cliente: \n");
                        //
                        //Exibindo para o usuário as parcelas já com os juros inclusos.
                        for(cont = 1; cont <= parcelas; cont++){
                            System.out.println(cont + "º" + " - VALOR: R$" + (valorEmp + igp_di) / parcelas);
                        }
                        System.out.println("SOMA TOTAL DAS PARCELAS: R$" + (valorEmp + igp_di));
                    }else{
                        System.out.println("\n\nStatus: EMPRÉSTIMO NÃO APROVADO!\n\nMOTIVO: Renda líquida menor que o valor somado de duas parcelas do empréstimo.\nTente fazer um nova simulação com um valor de empréstimo mais baixo ou que a renda líquida cubra duas parcelas do empréstimo.");
                    }
                    break;
                case 8:
                    System.out.println("TAXA \"IGP-M - Índ. Geral de Preços De Mercado\" foi selecionada");
                    igp_m = valorEmp * parcelas * 0.21;
                    if (rendaLiquida > igp_m) {
                        System.out.println("\n\nStatus: EMPRÉSTIMO APROVADO!\n\nNOME DO CLIENTE: " + nome + "\nRENDA BRUTA: R$" + rendaBruta + "\nRENDA LÍQUIDA: R$" + rendaLiquida + "\nTOTAL DO EMPRÉSTIMO SOLICITADO PELO CLIENTE: R$" + valorEmp + "\nJUROS TOTAIS: R$" + seliC + "\nVALOR TOTAL DO EMPRÉSTIMO COM JUROS: R$" + (valorEmp + igp_m) + "\nTAXA SELECIONADA: IGP-M - Índ. Geral de Preços De Mercado" + "\nTOTAL DE PARCELAS: " + parcelas + "\nLISTA COMPLETA COM AS " + parcelas + " parcelas mais juros optados pelo cliente: \n");
                        //
                        //Exibindo para o usuário as parcelas já com os juros inclusos.
                        for(cont = 1; cont <= parcelas; cont++){
                            System.out.println(cont + "º" + " - VALOR: R$" + (valorEmp + igp_m) / parcelas);
                        }
                        System.out.println("SOMA TOTAL DAS PARCELAS: R$" + (valorEmp + igp_m));
                    }else{
                        System.out.println("\n\nStatus: EMPRÉSTIMO NÃO APROVADO!\n\nMOTIVO: Renda líquida menor que o valor somado de duas parcelas do empréstimo.\nTente fazer um nova simulação com um valor de empréstimo mais baixo ou que a renda líquida cubra duas parcelas do empréstimo.");
                    }
                    break;
                case 9:
                    System.out.println("TAXA \"IPCA - Índ. Preços ao Consumidor Amplo\" foi selecionada");
                    ipca = valorEmp * parcelas * 0.83;
                    if (rendaLiquida > ipca) {
                        System.out.println("\n\nStatus: EMPRÉSTIMO APROVADO!\n\nNOME DO CLIENTE: " + nome + "\nRENDA BRUTA: R$" + rendaBruta + "\nRENDA LÍQUIDA: R$" + rendaLiquida + "\nTOTAL DO EMPRÉSTIMO SOLICITADO PELO CLIENTE: R$" + valorEmp + "\nJUROS TOTAIS: R$" + seliC + "\nVALOR TOTAL DO EMPRÉSTIMO COM JUROS: R$" + (valorEmp + ipca) + "\nTAXA SELECIONADA: IPCA - Índ. Preços ao Consumidor Amplo" + "\nTOTAL DE PARCELAS: " + parcelas + "\nLISTA COMPLETA COM AS " + parcelas + " parcelas mais juros optados pelo cliente: \n");
                        //
                        //Exibindo para o usuário as parcelas já com os juros inclusos.
                        for(cont = 1; cont <= parcelas; cont++){
                            System.out.println(cont + "º" + " - VALOR: R$" + (valorEmp + ipca) / parcelas);
                        }
                        System.out.println("SOMA TOTAL DAS PARCELAS: R$" + (valorEmp + ipca));
                    }else{
                        System.out.println("\n\nStatus: EMPRÉSTIMO NÃO APROVADO!\n\nMOTIVO: Renda líquida menor que o valor somado de duas parcelas do empréstimo.\nTente fazer um nova simulação com um valor de empréstimo mais baixo ou que a renda líquida cubra duas parcelas do empréstimo.");
                    }
                    break;
                default:
                    System.out.println("\nVALOR INCORRETO!\nPor favor, selecione uma das taxas de juros informadas.\nSelecione uma das taxas informadas: ");
                    break;
            }
        } while (taxaJuros != 5 && taxaJuros != 6 && taxaJuros != 7 && taxaJuros != 8 && taxaJuros != 9);
    }
}
