package Logica;
import java.util.Scanner;

public class Questao61 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double fileduplo,alcatara,picanha,desconto,totalDescontado,kilo,totalPagamento,precoFinal;
        int tipo,tipoPagamento;
        System.out.println("Informe o tipo de carne: \n1- File Duplo\n2- Alcatara\n3- Picanha");
        tipo = sc.nextInt();
        fileduplo = 4.90;
        alcatara = 5.90;
        picanha = 6.90;
        desconto = 0.05;
        totalDescontado = 0;
        if (tipo == 1) {
            System.out.println("Quantos kilos de file duplo? ");
            kilo = sc.nextDouble();
            totalPagamento = kilo * fileduplo;
            if (kilo > 5) {
                fileduplo = 5.80;
                totalPagamento  = kilo * fileduplo;
                System.out.println("forma de pagamento: \n1- Dinheiro\n2- Cartao de debito\n3- Cartao de credito\n4- Cartão tabarajara");
                tipoPagamento = sc.nextInt();
                if (tipoPagamento == 4) {
                    totalDescontado = (totalPagamento * desconto);
                    precoFinal = totalPagamento - totalDescontado;
                    System.out.println("O tipo da carne foi file duplo");
                    System.out.println("A quantidade de kilos foi: " + kilo);
                    System.out.println("O valor a ser pago era: " + totalPagamento);
                    System.out.println("O tipo de pagamento foi: Cartão Tabarajara");
                    System.out.println("O valor a ser pago com desconto foi: " + totalDescontado);
                    System.out.println("O valor a ser pago é: " + precoFinal);
                } else {
                    if (tipoPagamento == 1) {
                        System.out.println("O tipo da carne foi file duplo");
                        System.out.println("A quantidade de kilos foi: " + kilo);
                        System.out.println("O valor a ser pago era: " + totalPagamento);
                        System.out.println("O tipo de pagamento foi: Dinheiro");
                        System.out.println("O valor a ser pago com desconto foi: " + totalDescontado);
                        System.out.println("O valor a ser pago é: " + totalPagamento);
                    } else if (tipoPagamento == 2) {
                        System.out.println("O tipo da carne foi file duplo");
                        System.out.println("A quantidade de kilos foi: " + kilo);
                        System.out.println("O valor a ser pago era: " + totalPagamento);
                        System.out.println("O tipo de pagamento foi: Cartão de debito");
                        System.out.println("O valor a ser pago com desconto foi: " + totalDescontado);
                        System.out.println("O valor a ser pago é: " + totalPagamento);
                    } else if (tipoPagamento == 3) {
                        System.out.println("O tipo da carne foi file duplo");
                        System.out.println("A quantidade de kilos foi: " + kilo);
                        System.out.println("O valor a ser pago era: " + totalPagamento);
                        System.out.println("O tipo de pagamento foi: Cartão de credito");
                        System.out.println("O valor a ser pago com desconto foi: " + totalDescontado);
                        System.out.println("O valor a ser pago é: " + totalPagamento);
                    }else {
                        System.out.println("Opção inválida!");
                    }
                }
            } else {
                System.out.println("forma de pagamento: \n1- Dinheiro\n2- Cartao de debito\n3- Cartao de credito\n4- Cartão tabarajara");
                tipoPagamento = sc.nextInt();
                if (tipoPagamento == 4) {
                    totalDescontado = (totalPagamento * desconto);
                    precoFinal = totalPagamento - totalDescontado;
                    System.out.println("O tipo da carne foi file duplo");
                    System.out.println("A quantidade de kilos foi: " + kilo);
                    System.out.println("O valor a ser pago era: " + totalPagamento);
                    System.out.println("O tipo de pagamento foi: Cartão Tabarajara");
                    System.out.println("O valor a ser pago com desconto foi: " + totalDescontado);
                    System.out.println("O valor a ser pago é: " + precoFinal);
                } else {
                    if (tipoPagamento == 1) {
                        System.out.println("O tipo da carne foi file duplo");
                        System.out.println("A quantidade de kilos foi: " + kilo);
                        System.out.println("O valor a ser pago era: " + totalPagamento);
                        System.out.println("O tipo de pagamento foi: Dinheiro");
                        System.out.println("O valor a ser pago com desconto foi: " + totalDescontado);
                        System.out.println("O valor a ser pago é: " + totalPagamento);
                    } else if (tipoPagamento == 2) {
                        System.out.println("O tipo da carne foi file duplo");
                        System.out.println("A quantidade de kilos foi: " + kilo);
                        System.out.println("O valor a ser pago era: " + totalPagamento);                        
                        System.out.println("O tipo de pagamento foi: Cartão de debito");
                        System.out.println("O valor a ser pago com desconto foi: " + totalDescontado);
                        System.out.println("O valor a ser pago é: " + totalPagamento);
                    } else if (tipoPagamento == 3) {
                        System.out.println("O tipo da carne foi file duplo");
                        System.out.println("A quantidade de kilos foi: " + kilo);
                        System.out.println("O valor a ser pago era: " + totalPagamento);
                        System.out.println("O tipo de pagamento foi: Cartão de credito");
                        System.out.println("O valor a ser pago com desconto foi: " + totalDescontado);
                        System.out.println("O valor a ser pago é: " + totalPagamento);
                    }else {
                        System.out.println("Opção inválida!");
                    }   
                }
            }
        } else if (tipo == 2){
            System.out.println("Quantos Alcatara de file duplo? ");
            kilo = sc.nextDouble();
            totalPagamento = kilo * alcatara;
            if (kilo > 5) {
                alcatara = 6.80;
                totalPagamento  = kilo * alcatara;
                System.out.println("forma de pagamento: \n1- Dinheiro\n2- Cartao de debito\n3- Cartao de credito\n4- Cartão tabarajara");
                tipoPagamento = sc.nextInt();
                if (tipoPagamento == 4) {
                    totalDescontado = (totalPagamento * desconto);
                    precoFinal = totalPagamento - totalDescontado;
                    System.out.println("O tipo da carne foi alcatara");
                    System.out.println("A quantidade de kilos foi: " + kilo);
                    System.out.println("O valor a ser pago era: " + totalPagamento);
                    System.out.println("O tipo de pagamento foi: Cartão Tabarajara");
                    System.out.println("O valor a ser pago com desconto foi: " + totalDescontado);
                    System.out.println("O valor a ser pago é: " + precoFinal);
                } else {
                    if (tipoPagamento == 1) {
                        System.out.println("O tipo da carne foi alcatara");
                        System.out.println("A quantidade de kilos foi: " + kilo);
                        System.out.println("O valor a ser pago era: " + totalPagamento);
                        System.out.println("O tipo de pagamento foi: Dinheiro");
                        System.out.println("O valor a ser pago com desconto foi: " + totalDescontado);
                        System.out.println("O valor a ser pago é: " + totalPagamento);
                    } else if (tipoPagamento == 2) {
                        System.out.println("O tipo da carne foi alcatara"); 
                        System.out.println("A quantidade de kilos foi: " + kilo);
                        System.out.println("O valor a ser pago era: " + totalPagamento);
                        System.out.println("O tipo de pagamento foi: Cartão de debito");
                        System.out.println("O valor a ser pago com desconto foi: " + totalDescontado);
                        System.out.println("O valor a ser pago é: " + totalPagamento);
                    } else if (tipoPagamento == 3) {
                        System.out.println("O tipo da carne foi alcatara");
                        System.out.println("A quantidade de kilos foi: " + kilo);
                        System.out.println("O valor a ser pago era: " + totalPagamento);
                        System.out.println("O tipo de pagamento foi: Cartão de credito");
                        System.out.println("O valor a ser pago com desconto foi: " + totalDescontado);
                        System.out.println("O valor a ser pago é: " + totalPagamento);
                    }else {
                        System.out.println("Opção inválida!");
                    }   
                }
            } else {
                System.out.println("forma de pagamento: \n1- Dinheiro\n2- Cartao de debito\n3- Cartao de credito\n4- Cartão tabarajara");
                tipoPagamento = sc.nextInt();
                if (tipoPagamento == 4) {
                    totalDescontado = (totalPagamento * desconto);
                    precoFinal = totalPagamento - totalDescontado;
                    System.out.println("O tipo da carne foi alcatara");
                    System.out.println("A quantidade de kilos foi: " + kilo);
                    System.out.println("O valor a ser pago era: " + totalPagamento);
                    System.out.println("O tipo de pagamento foi: Cartão Tabarajara");
                    System.out.println("O valor a ser pago com desconto foi: " + totalDescontado);
                    System.out.println("O valor a ser pago é: " + precoFinal);
                } else {
                    if (tipoPagamento == 1) {
                        System.out.println("O tipo da carne foi alcatara");
                        System.out.println("A quantidade de kilos foi: " + kilo);
                        System.out.println("O valor a ser pago era: " + totalPagamento);
                        System.out.println("O tipo de pagamento foi: Dinheiro");
                        System.out.println("O valor a ser pago com desconto foi: " + totalDescontado);
                        System.out.println("O valor a ser pago é: " + totalPagamento);
                    } else if (tipoPagamento == 2) {
                        System.out.println("O tipo da carne foi alcatara"); 
                        System.out.println("A quantidade de kilos foi: " + kilo);
                        System.out.println("O valor a ser pago era: " + totalPagamento);
                        System.out.println("O tipo de pagamento foi: Cartão de debito");
                        System.out.println("O valor a ser pago com desconto foi: " + totalDescontado);
                        System.out.println("O valor a ser pago é: " + totalPagamento);
                    } else if (tipoPagamento == 3) {
                        System.out.println("O tipo da carne foi alcatara");
                        System.out.println("A quantidade de kilos foi: " + kilo);    
                        System.out.println("O valor a ser pago era: " + totalPagamento);
                        System.out.println("O tipo de pagamento foi: Cartão de credito");    
                        System.out.println("O valor a ser pago com desconto foi: " + totalDescontado);
                        System.out.println("O valor a ser pago é: " + totalPagamento);
                    }else {
                        System.out.println("Opção inválida!");
                    }   
                }
            }
        } else if (tipo == 3) {
            System.out.println("Quantos kilos de picanha? ");
            kilo = sc.nextDouble();
            totalPagamento = kilo * picanha;
            if (kilo > 5) {
                picanha = 7.80;
                totalPagamento = kilo * picanha;
                System.out.println("forma de pagamento: \n1- Dinheiro\n2- Cartao de debito\n3- Cartao de credito\n4- Cartão tabarajara");
                tipoPagamento = sc.nextInt();
                if (tipoPagamento == 4) {
                    totalDescontado = (totalPagamento * desconto);
                    precoFinal = totalPagamento - totalDescontado;
                    System.out.println("O tipo da carne foi picanha");
                    System.out.println("A quantidade de kilos foi: " + kilo);
                    System.out.println("O valor a ser pago era: " + totalPagamento);
                    System.out.println("O tipo de pagamento foi: Cartão Tabarajara");
                    System.out.println("O valor a ser pago com desconto foi: " + totalDescontado);
                    System.out.println("O valor a ser pago é: " + precoFinal);
                } else {
                    if (tipoPagamento == 1) {
                        System.out.println("O tipo da carne foi picanha");
                        System.out.println("A quantidade de kilos foi: " + kilo);
                        System.out.println("O valor a ser pago era: " + totalPagamento);
                        System.out.println("O tipo de pagamento foi: Dinheiro");
                        System.out.println("O valor a ser pago com desconto foi: " + totalDescontado);
                        System.out.println("O valor a ser pago é: " + totalPagamento);
                    } else if (tipoPagamento == 2) {
                        System.out.println("O tipo da carne foi picanha"); 
                        System.out.println("A quantidade de kilos foi: " + kilo);
                        System.out.println("O valor a ser pago era: " + totalPagamento);
                        System.out.println("O tipo de pagamento foi: Cartão de debito");
                        System.out.println("O valor a ser pago com desconto foi: " + totalDescontado);
                        System.out.println("O valor a ser pago é: " + totalPagamento);
                    } else if (tipoPagamento == 3) {
                        System.out.println("O tipo da carne foi picanha");
                        System.out.println("A quantidade de kilos foi: " + kilo);    
                        System.out.println("O valor a ser pago era: " + totalPagamento);
                        System.out.println("O tipo de pagamento foi: Cartão de credito");    
                        System.out.println("O valor a ser pago com desconto foi: " + totalDescontado);
                        System.out.println("O valor a ser pago é: " + totalPagamento);
                    }else {
                        System.out.println("Opção inválida!");
                    }   
                }
            }
        }
        sc.close();   
    }
}