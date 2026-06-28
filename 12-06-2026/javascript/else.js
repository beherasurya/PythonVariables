let text;
if(Math.random() <0.5){
    text= "<a href = 'https://w3schools.com'> Visit W3Schools</a>";
} else{
    text = "<a href = 'https://wwf.org'>Visit WWF</a>";

}
document.getElementById("demo").innerHTML=text;