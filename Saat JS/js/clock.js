let isim = prompt("Isminizi girin:")
isim = isim[0].toUpperCase() + isim.substring(1)
let myName = document.querySelector("#myName")

myName.innerHTML = isim

function showTime() {
    let dateData = new Date()
    let hours = dateData.getHours()
    let minutes=dateData.getMinutes()
    let seconds=dateData.getSeconds()

    let days = ['Pazar','Pazartesi', 'Salı', 'Çarşamba', 'Perşembe', 'Cuma', 'Cumartesi']
    let dayName = days[dateData.getDay()]

    let info =document.querySelector("#myClock")
    info.innerHTML = `${hours}:${minutes}:${seconds} ${dayName}`
    setTimeout(showTime, 1000); 

}
 showTime();