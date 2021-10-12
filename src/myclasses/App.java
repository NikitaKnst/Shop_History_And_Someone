/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myclasses;

import entity.Owner1;
import entity.Product;
import entity.Seller;
import entity.History;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
/**
 *
 * @author Melnikov
 */
public class App {
    Scanner scanner = new Scanner(System.in);
    Product[] product1 = new Product[10];
    Owner1[] readers = new Owner1[10];
    History[] histories = new History[10];
    

    public App() {
    }
    
           

  
    public void run(){
        String repeat = "y";
        do{
            System.out.println("Выберите задачу: ");
            System.out.println("0: Закончить программу");
            System.out.println("1: Добавить товар");
            System.out.println("2: Список товаров");
            System.out.println("3: Добавить покупателя");
            System.out.println("4: Список покупателя");
            System.out.println("5: Продать товар");
            System.out.println("6: Список проданных товаров");
            
            int task = scanner.nextInt();
            scanner.nextLine();
            switch (task) {
                case 0: 
                    repeat="q";
                    System.out.println("Программа закончена");
                    break;
                case 1: 
                    System.out.println("Добавление книги: ");
                    for (int i = 0; i < product1.length; i++) {
                        if(product1[i] == null){
                            product1[i] = addProduct();
                            break;
                        }
                    }
                    break;
                case 2: 
                    System.out.println("Список товаров: ");
                    for (int i = 0; i < product1.length; i++) {
                        if(product1[i] != null){
                            System.out.println(product1[i].toString());
                        }
                    }
                    break;
                case 3: 
                    System.out.println("Добавление покупателя: ");
                    for (int i = 0; i < readers.length; i++) {
                        if(readers[i] == null){
                            readers[i] = addOwner1();
                            break;
                        }
                    }
                    break;
                case 4: 
                    System.out.println("Список покупателей: ");
                    for (int i = 0; i < readers.length; i++) {
                        if(readers[i] != null){
                            System.out.println(readers[i].toString());
                        }
                    }
                    break;
                case 5: 
                    System.out.println("проданные товары: ");
                    for (int i = 0; i < histories.length; i++) {
                        if(histories[i] == null){
                            histories[i] = addHistory();
                            break;
                        }
                    }
                    break;
                case 6: 
                    printGivenBooks();
                    break;
               
            }
        }while("y".equals(repeat));
    }
    private void printGivenBooks(){
        System.out.println("Список проданных товарв: ");
                    for (int i = 0; i < histories.length; i++) {
                        if(histories[i] != null && histories[i].getReturnDate() == null){
                            System.out.printf("%d. Купили: %s товар %s %s%n",
                                    i+1,
                                    histories[i].getProduct().getCaption(),
                                    histories[i].getOwner1().getFirstname(),
                                    histories[i].getOwner1().getLastname()
                            );
                            
                        }
                    }
    }
    private History addHistory(){
        History history = new History();
        /**
         * 1. Вывести нумерованный список книг
         * 2. получить от пользователя номер книги: bookNumber
         * 3. Вывести список читателей
         * 4. получить от пользователя номер читателя: readerNumber
         * 5. В history инициировать поле book объектом, который лежит в
         *      массиве books[bookNumber-1].
         * 6. В history инициировать поле reader объектом, который лежит в 
         *      массиве readers[readerNumber-1].
         * 7. Получить текущую дату и положить ее в поле history.givenDate
         * 
         */
        System.out.println("Список товаров: ");
        for (int i = 0; i < product1.length; i++) {
            if(product1[i] != null){
                System.out.printf("%d. %s%n",i+1,product1[i].toString());
            }
        }
        System.out.print("Введите номер книги: ");
        int productNumber = scanner.nextInt(); scanner.nextLine();
        history.setProduct(product1[productNumber-1]);
        System.out.println();
        System.out.println("Список покупателей: ");
        for (int i = 0; i < readers.length; i++) {
            if(readers[i] != null){
                System.out.printf("%d. %s%n",i+1,readers[i].toString());
            }
        }
        System.out.print("Введите номер покупателя: ");
        int readerNumber = scanner.nextInt(); scanner.nextLine();
        history.setOwner1(readers[readerNumber-1]);
        Calendar c = new GregorianCalendar();
        history.setGivenDate(c.getTime());
        return history;
    }
    private Owner1 addOwner1(){
        Owner1 reader = new Owner1();
        System.out.print("Введите имя покупателя: ");
        reader.setFirstname(scanner.nextLine());
        System.out.print("Введите фамилию покупателя: ");
        reader.setLastname(scanner.nextLine());
        System.out.print("Введите номер телефона покупателя: ");
        reader.setPhone(scanner.nextLine());
        return reader;
    }
    private Product addProduct(){
        Product product2Sec = new Product();
        System.out.print("Название продукта: ");
        product2Sec.setCaption(scanner.nextLine());
        System.out.print("Цену: ");
        product2Sec.setPrice(scanner.nextInt());
        scanner.nextLine();
        System.out.print("Сколько продавцок: ");
        int countSeller=scanner.nextInt();
        scanner.nextLine();
        Seller[] seller166 = new Seller[countSeller];
        for (int i = 0; i < seller166.length; i++) {
            System.out.println("Добавление автора "+(i+1));
            Seller seller13 = new Seller();
            System.out.print("Имя автора: ");
            seller13.setName(scanner.nextLine());
            System.out.print("Фамилия автора: ");
            seller13.setLastname(scanner.nextLine());
            System.out.print("Год рождения автора: ");
            seller13.setYear(scanner.nextInt());
            System.out.print("День рождения автора: ");
            seller13.setDay(scanner.nextInt());
            System.out.print("Месяц рождения автора: ");
            seller13.setMonth(scanner.nextInt());
            scanner.nextLine();
            seller166[i]= seller13;
        }
        product2Sec.setSeller(seller166);
        return product2Sec;
    }
    
}
        //System.out.println("Hello");
        //Product product1 = new Product();
        //product1.setCaption("Chees");
        //product1.setPrice(25);
        //Seller seller1 = new Seller();
        //seller1.setName("Lev");
        //seller1.setLastname("Tolstoy");
        //seller1.setYear(1828);
        //seller1.setDay(9);
        //seller1.setMonth(9);
        //Seller[] seller10 = new Seller[1];
        //seller10[0]=seller1;
        //product1.setSeller(seller10);

        //Product product2 = new Product();
        //product2.setCaption("Milk");
        //product2.setPrice(15022);
        //Seller seller2 = new Seller();
        //seller2.setName("Ivan");
        //seller2.setLastname("Turgenev");
        //seller2.setDay(9);
        //seller2.setMonth(11);
        //seller2.setYear(1818);
        //Seller[] seller20 = new Seller[1];
        //seller20[0]=seller2;
        //product2.setSeller(seller20);

        
        //Owner1 owner1 = new Owner1();
        //owner1.setFirstname("Ivan");
        //owner1.setLastname("Ivanov");
        //owner1.setPhone("4564545345");
        
        //History history1 = new History();
        //history1.setBook(product1);
        //history1.setOwner1(owner1);
        //Calendar c = new GregorianCalendar();
        //history1.setGivenDate(c.getTime());
        //System.out.println("history1 = "+history1.toString());
        //System.out.println(" --------------- ");
        //history1.setReturnDate(c.getTime());
        //System.out.println("history1 = "+history1.toString());
        
        
        //History history2 = new History();
        //history1.setBook(product2);
        //history1.setOwner1(owner1);
        //Calendar c2 = new GregorianCalendar();
        //history1.setGivenDate(c.getTime());
        //System.out.println("history1 = "+history1.toString());
        //System.out.println(" --------------- ");
        //history1.setReturnDate(c.getTime());
        //System.out.println("history1 = "+history1.toString());
        
   
