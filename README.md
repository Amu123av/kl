#html
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>CSS Project</title>
    <link rel="stylesheet" href="style.css"/>
    <link rel="preconnect" href="https://fonts.googleapis.com" />
    <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin />
    <link
      href="https://fonts.googleapis.com/css2?family=Poppins&display=swap"
      rel="stylesheet"
    />
    <link
      rel="stylesheet"
      href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.4.0/css/all.min.css"
    />
  </head>
  <body>
    <div class="main_box">
      <input type="checkbox" id="check" />
      <div class="btn_one">
        <label for="check" style="color: white">
          <i class="fa-solid fa-bars"></i>
        </label>
      </div>

      <div class="sidebar_menu">
        <div class="logo">
          <a href="#">Apna College</a>
        </div>

        <div class="btn_two">
          <label for="check" style="color: grey">
            <i class="fa-solid fa-xmark"></i>
          </label>
        </div>

        <div class="menu">
          <ul>
            <li>
              <i class="fa-solid fa-image"></i>
              <a href="#">Gallery</a>
            </li>
            <li>
              <i class="fa-solid fa-arrow-up-right-from-square"></i>
              <a href="#">Shortcuts</a>
            </li>
            <li>
              <i class="fa-solid fa-photo-film"></i>
              <a href="#">Exhibits</a>
            </li>
            <li>
              <i class="fa-solid fa-calendar-days"></i>
              <a href="#">Events</a>
            </li>
            <li>
              <i class="fa-solid fa-store"></i>
              <a href="#">Store</a>
            </li>
            <li>
              <i class="fa-solid fa-phone"></i>
              <a href="#">Contact</a>
            </li>
            <li>
              <i class="fa-regular fa-comments"></i>
              <a href="#">Feedback</a>
            </li>
          </ul>
        </div>

        <div class="social_media">
          <ul>
            <a href="#"><i class="fa-brands fa-facebook"></i></i></a>
            <a href="#"><i class="fa-brands fa-twitter"></i></a>
            <a href="#"><i class="fa-brands fa-instagram"></i></i></a>
            <a href="#"><i class="fa-brands fa-youtube"></i></a>
          </ul>
        </div>
      </div>
    </div>
  </body>
</html>


#css
*{
    margin: 0;
    padding: 0;
    font-family: 'Courier New', Courier, monospace;
}
.main_box {
   background:url("photo.jpg"); 
   height: 100vh;
   background-size: cover;
}
.btn_one i{
  color: rgb(220, 201, 201);
  font-size: 25px;  
font-weight: 700;
position: absolute;
left: 16px;
line-height:  60px;
top: 8px;
cursor: progress;
}
.sidebar_menu{
  position: fixed;
left: -350px;
height: 100vh;
width: 250px;
background-color: rgba(255, 255, 255, 0.086);
transition: all 0.3s linear;
}

.sidebar_menu .logo{
  position: absolute;
  width: 100%;
  line-height: 30px;
  box-shadow:0 0 5px rgba(255, 255, 255, 0.5);
}
.sidebar_menu .logo a{
  position: absolute;
  left: 50px;
  color: white;
  text-decoration: none;
  font-size: 20px;
  font-weight:800;
  top: 20px;
}
.sidebar_menu .btn_two i{
  color: rgba(235, 227, 228, 0.208);
  font-size: 25px;  
font-weight: 700;
line-height: 60px;
position: absolute;
left: 220px;
cursor: progress;

 
}

.sidebar_menu .menu{
  color: rgb(91, 208, 189);
  position:absolute;
  width: 100%;
  top:70px;
}
.sidebar_menu .menu li{
  margin-top:6px;
  padding: 14px 20px;
}

.sidebar_menu .menu i,a{
  color: antiquewhite;
  text-decoration: none;
  font-size: 20px;
  font-weight:700;
}
.sidebar_menu .menu i{
  padding-right:8px ;
}
.sidebar_menu .social_media  {
  
  position:absolute;
  left: 25%;
  bottom: 50px;
  
}
.sidebar_menu .social_media i{
color: rgba(247, 237, 237, 0.808);
}
#check{
  display: none;
}
.sidebar_menu .menu li:hover{
  box-shadow:0 0 6px rgba(255, 255, 255, 0.5);
}
.btn_one i:hover {
  font-size:40px;
 
}

.btn_two i:hover {
  font-size:30px;
 
}
.sidebar_menu .social_media:hover{
  opacity: 1;
  transform: scale(1.1);
}
#check:checked ~ .sidebar_menu{
  left: 0;
}
#check:checked ~ .btn_one i{
  opacity: 0;
}
#check:checked ~ .sidebar_menu .btn_two i{
  opacity: 1;
}
