const endDate = "30 June 2023 10:00 PM"
document.getElementById("end-date").innerText = endDate;
const inputs = document.querySelectorAll("input");
const clock = () =>{
    const end= new Date(endDate);
    let now = new Date();
    let diff = (end-now)/1000;

    if(diff<0) return;
    inputs[0].value = Math.floor(diff/3600/24);
    inputs[1].value = Math.floor((diff%(3600*24))/3600);
    inputs[2].value = Math.floor((diff%(3600))/60);
    inputs[3].value = Math.floor((diff%60));
}
clock();