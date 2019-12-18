/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;


    
   
/**
 *
 * @author cmikj
 */
public class MVC  {

  
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        //views
        CreateAccountView createAccount = new CreateAccountView();
        AccountListView accountList = new AccountListView();
        AccessExistingAccountView accessExistingAccount = new AccessExistingAccountView();
        
        //models
        ShoppingCart shoppingCart = new ShoppingCart();
        Balance balance = new Balance();
        
        //controllers
        CreateAccountController createAccountController = new CreateAccountController(createAccount, shoppingCart, balance);
        AccountListController accountListController = new AccountListController(accountList, shoppingCart, balance);
        ExistingAccountController existingAccountController = new ExistingAccountController(accessExistingAccount, shoppingCart, balance);
        
        createAccount.setVisible(true);
        accountList.setVisible(true);
      accessExistingAccount.setVisible(true); 
        
    }

}  

