//alert("hola mundo");
setInterval(reloadImage,60);
function reloadImage(){
  var imagediv = document.getElementById("imagestream");
  imagediv.src = imagediv.src+"?t=" + new Date().getTime();
}