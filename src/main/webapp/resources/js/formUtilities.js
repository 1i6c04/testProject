/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

function submitPage(event){
    if (event.keyCode === 13){
        event.preventDefault();
        document.getElementById("shoppingCartForm:updateForm").click();
    }
}


