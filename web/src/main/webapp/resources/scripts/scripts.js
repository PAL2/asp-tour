$(function () {
    $('#end').datepicker();
    var today = new Date();
    var tomorrow = new Date(today.getTime() + 24 * 60 * 60 * 1000);
    $('#start').datepicker({
        minDate: tomorrow,
        onSelect: function (dat) {
            $('#end').datepicker('option', 'minDate', dat);
        }
    });
});

function Selected(a) {
    var country = a.value;
    if (country == "Болгария") {
        document.getElementById("Болгария").style.display = 'inline-block';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "Греция") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'inline-block';
        document.getElementById("Греция").setAttribute("name", "city");
        document.getElementById("Болгария").setAttribute("name", "c");
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "Египет") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'inline-block';
        document.getElementById("Египет").setAttribute("name", "city");
        document.getElementById("Болгария").setAttribute("name", "c");
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "Испания") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'inline-block';
        document.getElementById("Испания").setAttribute("name", "city");
        document.getElementById("Болгария").setAttribute("name", "c");
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "Италия") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'inline-block';
        document.getElementById("Италия").setAttribute("name", "city");
        document.getElementById("Болгария").setAttribute("name", "c");
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "Кипр") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'inline-block';
        document.getElementById("Кипр").setAttribute("name", "city");
        document.getElementById("Болгария").setAttribute("name", "c");
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "Куба") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'inline-block';
        document.getElementById("Куба").setAttribute("name", "city");
        document.getElementById("Болгария").setAttribute("name", "c");
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "Марокко") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'inline-block';
        document.getElementById("Марокко").setAttribute("name", "city");
        document.getElementById("Болгария").setAttribute("name", "c");
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "ОАЭ") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'inline-block';
        document.getElementById("ОАЭ").setAttribute("name", "city");
        document.getElementById("Болгария").setAttribute("name", "c");
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "Таиланд") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'inline-block';
        document.getElementById("Таиланд").setAttribute("name", "city");
        document.getElementById("Болгария").setAttribute("name", "c");
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "Турция") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'inline-block';
        document.getElementById("Турция").setAttribute("name", "city");
        document.getElementById("Болгария").setAttribute("name", "c");
        document.getElementById("Черногория").style.display = 'none';
    } else if (country == "Черногория") {
        document.getElementById("Болгария").style.display = 'none';
        document.getElementById("Греция").style.display = 'none';
        document.getElementById("Египет").style.display = 'none';
        document.getElementById("Испания").style.display = 'none';
        document.getElementById("Италия").style.display = 'none';
        document.getElementById("Кипр").style.display = 'none';
        document.getElementById("Куба").style.display = 'none';
        document.getElementById("Марокко").style.display = 'none';
        document.getElementById("ОАЭ").style.display = 'none';
        document.getElementById("Таиланд").style.display = 'none';
        document.getElementById("Турция").style.display = 'none';
        document.getElementById("Черногория").style.display = 'inline-block';
        document.getElementById("Черногория").setAttribute("name", "city");
        document.getElementById("Болгария").setAttribute("name", "c");
    }
}