/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
window.onload = function () {
    var wrap = document.getElementById('wrap'),
        wrapBox = document.getElementById('wrap-box'),
        liBtn = document.querySelectorAll('#btn-list li'),
        index = 0,
        timer = null;
    //定義並調用自動輪播函數
    if (timer) {
        //停止自動輪播
        clearInterval(timer);
        timer = null;
    }
    timer = setInterval(autoplay, 3000);
    //定義圖片切換函數
    function autoplay() {
        index++;
        if (index >= liBtn.length) {
            index = 0;
        }
        changeImg(index);
    }
    function changeImg(curIndex) {
        for (var i = 0; i < liBtn.length; i++) {
            liBtn[i].className = '';
            wrapBox.style.left = 0;
        }
        liBtn[curIndex].className = 'active';
        wrapBox.style.left = -curIndex * 780 + 'px';
        index = curIndex;
        }
        //鼠標進入清除定時器
    wrap.onmouseover = function () {
        clearInterval(timer);
    }
    //鼠標移出後啟動輪播
    wrap.onmouseout = function () {
        timer = setInterval(autoplay, 3000);
    }
    //鼠標移動到小圓點時顯示對應的圖片
    for (var j = 0; j < liBtn.length; j++) {
        liBtn[j].order = j;
        liBtn[j].onmouseover = function () {
            clearInterval(timer);
            changeImg(this.order);
        }
    }
}

