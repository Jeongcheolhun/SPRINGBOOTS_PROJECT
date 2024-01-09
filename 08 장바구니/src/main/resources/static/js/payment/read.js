

const pay_phone_btn = document.querySelector('.pay_phone_btn');
pay_phone_btn.addEventListener('click',function(){

    IMP.init("imp27854876");

    IMP.request_pay({
        pg: "danal",
        pay_method: "phone",
        merchant_uid: "test_lr5vzo7r",
        name: "테스트 결제",
        amount: 100,
        buyer_tel: "010-0000-0000",
      });

})



