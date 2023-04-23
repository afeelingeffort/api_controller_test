<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
   href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />
<link rel="stylesheet"
   href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<link rel="stylesheet"
   href="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.css" />
<script src="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.js"></script>
<style type="text/css">
body {
   width: 100%;
   margin: 0;
   padding: 0;
   box-sizing: border-box;
}

.top-menu{
   display: flex;
   justify-content: flex-end;
   padding-right: 100px;
}

.top-menu h5{
   padding: 0px 10px;
}

.home-category-wrap {
   display: flex;
   justify-content: space-around;
}

.material-symbols-outlined {
   display: flex;
   font-variation-settings: 'FILL' 0, 'wght' 400, 'GRAD' 0, 'opsz' 48;
   align-items: center;
   justify-content: space-around;
}

.home-category {
   display: flex;
   justify-content: flex-end;
   align-items: center;
}

.home-category h3, material-symbols-outlined {
   padding: 0 20px;
}

a {
   text-decoration: none;
   color: black;
}

.recommend-category {
   display: flex;
   justify-content: space-around;
}

/* 왼쪽으로 모는 법 모르겠어요 */
.recommend-category h3 {
   display: flex;
}

html, body {
   height: 100%;
}

body {
   font-family: Helvetica Neue, Helvetica, Arial, sans-serif;
   font-size: 14px;
   color: #000;
   margin: 0;
   padding: 0;
}

.swiper {
   width: 100%;
   height: 40%;
}

.swiper-slide {
   text-align: center;
   font-size: 18px;
   background: #fff;
   display: flex;
   justify-content: center;
   align-items: center;
}

.swiper-slide img {
   display: block;
   width: 80%;
   height: 40%;
   object-fit: cover;
}

.mySwiper {
   color: black;
}

.swiper-button-prev, .swiper-button-next {
   color: black;
}

:root {
   --swiper-theme-color: white;
}

.menu-box-wrap {
   display: flex;
   justify-content: center;
   width: 100%;
   height: 20%;
}


.menu-box {
   display: flex;
   justify-content: space-around;
   background-color: yellow;
   border-radius: 20px;
   margin: 30px;
   width: 500px;
   heigh: 150px;
   width: 500px;
}

</style>
</head>
<body>
   <div class="top-menu">
      <h5>고객 센터</h5>
      <h5>관심 상품</h5>
      <h5><a href="/user/modify-info">회원정보수정</a></h5>
      <h5><a href="/user/join">회원가입</a></h5>
      <h5><a href="/user/login">로그인</a></h5>
   </div>
   <div class="home-category-wrap">
      <h1>
         <i>TENCO</i>
      </h1>
      <div class="home-category">
         <h3>
            <a href="#">HOME</a>
         </h3>
         <h3>
            <a href="#">STYLE</a>
         </h3>
         <h3>
            <a href="#">SHOP</a>
         </h3>
         <h3>
            <a href="#">MY</a>
         </h3>
         <span class="material-symbols-outlined"> search </span>
      </div>
   </div>

   <div class="recommend-category">
      <h3>
         <a href="#">추천</a>
      </h3>
      <h3>
         <a href="#">남성</a>
      </h3>
      <h3>
         <a href="#">여성</a>
      </h3>
      <h3>
         <a href="#">브랜드</a>
      </h3>
      <h3>
         <a href="#">기획전</a>
      </h3>
   </div>

   <!-- Swiper : 자동으로 슬라이드 되게 구현 안됨. -->
   <div class="swiper mySwiper">
      <div class="swiper-wrapper">
         <div class="swiper-slide">Slide 1</div>
         <div class="swiper-slide">Slide 2</div>
         <div class="swiper-slide">Slide 3</div>
         <div class="swiper-slide">Slide 4</div>
         <div class="swiper-slide">Slide 5</div>
         <div class="swiper-slide">Slide 6</div>
         <div class="swiper-slide">Slide 7</div>
         <div class="swiper-slide">Slide 8</div>
         <div class="swiper-slide">Slide 9</div>
      </div>
      <div class="swiper-button-next"></div>
      <div class="swiper-button-prev"></div>
      <div class="swiper-pagination"></div>
   </div>

   <!-- script를 위로 올리면 안됨! -->
   <!-- Swiper JS -->
   <script
      src="https://cdn.jsdelivr.net/npm/swiper@9/swiper-bundle.min.js"></script>

   <!-- Initialize Swiper -->
   <script>
      var swiper = new Swiper(".mySwiper", {
         cssMode : true,
         navigation : {
            nextEl : ".swiper-button-next",
            prevEl : ".swiper-button-prev",
         },
         pagination : {
            el : ".swiper-pagination",
         },
         mousewheel : true,
         keyboard : true,
      });
   </script>

   <div class="menu-box-wrap">
      <div class="menu-box">zz</div>
      <div class="menu-box"></div>
      <div class="menu-box"></div>
      <div class="menu-box"></div>
   </div>

</body>
</html>