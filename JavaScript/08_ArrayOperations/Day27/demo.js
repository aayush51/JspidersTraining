//! array.reduce() method

// let sum = 0
// let arr = [10, 20, 30, 40]
// for (let i = 0; i < arr.length; i++) {
//     sum += arr[i]
// }
// console.log(sum);

// let sum = 0
// let arr = [10, 20, 30, 40]
// arr.forEach(e => {
//     sum += e
// });
// console.log(sum);

initialValueOfAccumulator = 1000
let arr1 = [10, 20, 30, 40]
let addition = arr1.reduce((acc, val, index, wholeArray) => {
    return acc + val
}, initialValueOfAccumulator)
console.log(addition)

//? accumulator holds value (all extracted value comes here)
//? implicitly it not returns array
//? reduce( ()=>{} , initialValueOfAccumulator )
//` reduce() method takes two parameters CallbackFunction and initialValueOfAccumulator
//~ initialValueOfAccumulator is like when we assign sum value with 0 to start sum with 0

console.log(arr1);
//? reduce() doesn't affect original array

//! array.find() method
let arr2 = [10, 20, 30, 40]
let greaterValue = arr2.find((val, index, wholeArray) => {
    return val > 20
})
console.log(greaterValue);

//? returns single value which satisfies condition first
//? returns undefined if no value satisfies the condition

let data = [{
    "id": 1,
    "first_name": "Esma",
    "last_name": "Kauscher",
    "email": "ekauscher0@reddit.com",
    "gender": "Female",
    "ip_address": "10.6.127.74"
}, {
    "id": 2,
    "first_name": "Inglis",
    "last_name": "Espinha",
    "email": "iespinha1@last.fm",
    "gender": "Male",
    "ip_address": "211.44.146.222"
}, {
    "id": 3,
    "first_name": "Flory",
    "last_name": "Woodfield",
    "email": "fwoodfield2@yelp.com",
    "gender": "Male",
    "ip_address": "118.234.254.74"
}, {
    "id": 4,
    "first_name": "Beltran",
    "last_name": "Pound",
    "email": "bpound3@wikispaces.com",
    "gender": "Male",
    "ip_address": "95.236.179.13"
}, {
    "id": 5,
    "first_name": "Sully",
    "last_name": "Gumbrell",
    "email": "sgumbrell4@mac.com",
    "gender": "Male",
    "ip_address": "176.35.39.200"
}, {
    "id": 6,
    "first_name": "Ilise",
    "last_name": "Gallegos",
    "email": "igallegos5@dailymotion.com",
    "gender": "Female",
    "ip_address": "134.106.70.184"
}, {
    "id": 7,
    "first_name": "Dawna",
    "last_name": "Currie",
    "email": "dcurrie6@digg.com",
    "gender": "Female",
    "ip_address": "10.10.22.147"
}, {
    "id": 8,
    "first_name": "Aluin",
    "last_name": "Errett",
    "email": "aerrett7@odnoklassniki.ru",
    "gender": "Male",
    "ip_address": "234.184.126.107"
}, {
    "id": 9,
    "first_name": "Ad",
    "last_name": "Pearton",
    "email": "apearton8@indiegogo.com",
    "gender": "Male",
    "ip_address": "30.178.5.213"
}, {
    "id": 10,
    "first_name": "Avictor",
    "last_name": "Redholes",
    "email": "aredholes9@4shared.com",
    "gender": "Male",
    "ip_address": "27.89.242.102"
}, {
    "id": 11,
    "first_name": "Emmalee",
    "last_name": "Walters",
    "email": "ewaltersa@berkeley.edu",
    "gender": "Female",
    "ip_address": "95.163.211.22"
}, {
    "id": 12,
    "first_name": "Herschel",
    "last_name": "Frantzeni",
    "email": "hfrantzenib@hexun.com",
    "gender": "Male",
    "ip_address": "32.86.135.55"
}, {
    "id": 13,
    "first_name": "Caria",
    "last_name": "Stratiff",
    "email": "cstratiffc@altervista.org",
    "gender": "Female",
    "ip_address": "18.75.84.125"
}, {
    "id": 14,
    "first_name": "Tedd",
    "last_name": "Mayow",
    "email": "tmayowd@biblegateway.com",
    "gender": "Male",
    "ip_address": "128.167.120.26"
}, {
    "id": 15,
    "first_name": "Brita",
    "last_name": "Coulman",
    "email": "bcoulmane@oracle.com",
    "gender": "Female",
    "ip_address": "57.85.3.175"
}, {
    "id": 16,
    "first_name": "Grover",
    "last_name": "Conkay",
    "email": "gconkayf@washingtonpost.com",
    "gender": "Bigender",
    "ip_address": "199.226.244.130"
}, {
    "id": 17,
    "first_name": "Orv",
    "last_name": "Hatchell",
    "email": "ohatchellg@redcross.org",
    "gender": "Male",
    "ip_address": "55.182.63.122"
}, {
    "id": 18,
    "first_name": "Moss",
    "last_name": "Golborn",
    "email": "mgolbornh@webmd.com",
    "gender": "Male",
    "ip_address": "249.233.38.48"
}, {
    "id": 19,
    "first_name": "Monique",
    "last_name": "Heaton",
    "email": "mheatoni@google.fr",
    "gender": "Female",
    "ip_address": "201.99.179.142"
}, {
    "id": 20,
    "first_name": "Shana",
    "last_name": "Purcell",
    "email": "spurcellj@bizjournals.com",
    "gender": "Female",
    "ip_address": "66.129.229.218"
}, {
    "id": 21,
    "first_name": "Ara",
    "last_name": "Robillard",
    "email": "arobillardk@nationalgeographic.com",
    "gender": "Male",
    "ip_address": "134.156.237.78"
}, {
    "id": 22,
    "first_name": "Webb",
    "last_name": "Vonasek",
    "email": "wvonasekl@webeden.co.uk",
    "gender": "Male",
    "ip_address": "176.188.1.18"
}, {
    "id": 23,
    "first_name": "Alberik",
    "last_name": "Mardy",
    "email": "amardym@so-net.ne.jp",
    "gender": "Genderfluid",
    "ip_address": "106.227.109.58"
}, {
    "id": 24,
    "first_name": "Alvinia",
    "last_name": "Moreinu",
    "email": "amoreinun@jalbum.net",
    "gender": "Female",
    "ip_address": "27.111.145.200"
}, {
    "id": 25,
    "first_name": "Pieter",
    "last_name": "Cooling",
    "email": "pcoolingo@wsj.com",
    "gender": "Male",
    "ip_address": "24.189.219.116"
}, {
    "id": 26,
    "first_name": "Kasey",
    "last_name": "Stampfer",
    "email": "kstampferp@pen.io",
    "gender": "Female",
    "ip_address": "86.101.73.150"
}, {
    "id": 27,
    "first_name": "Sonny",
    "last_name": "Klicher",
    "email": "sklicherq@bravesites.com",
    "gender": "Female",
    "ip_address": "2.162.41.214"
}, {
    "id": 28,
    "first_name": "Uta",
    "last_name": "Morston",
    "email": "umorstonr@discuz.net",
    "gender": "Female",
    "ip_address": "46.249.136.164"
}, {
    "id": 29,
    "first_name": "Mitchel",
    "last_name": "Latliff",
    "email": "mlatliffs@telegraph.co.uk",
    "gender": "Male",
    "ip_address": "69.68.223.129"
}, {
    "id": 30,
    "first_name": "Garek",
    "last_name": "Jumel",
    "email": "gjumelt@naver.com",
    "gender": "Male",
    "ip_address": "136.47.32.255"
}, {
    "id": 31,
    "first_name": "Keven",
    "last_name": "Southgate",
    "email": "ksouthgateu@weather.com",
    "gender": "Non-binary",
    "ip_address": "212.95.155.103"
}, {
    "id": 32,
    "first_name": "Monte",
    "last_name": "Eul",
    "email": "meulv@sun.com",
    "gender": "Male",
    "ip_address": "220.173.200.240"
}, {
    "id": 33,
    "first_name": "Gene",
    "last_name": "Marusic",
    "email": "gmarusicw@cafepress.com",
    "gender": "Polygender",
    "ip_address": "245.235.134.50"
}, {
    "id": 34,
    "first_name": "Rodger",
    "last_name": "Scolts",
    "email": "rscoltsx@sourceforge.net",
    "gender": "Male",
    "ip_address": "210.146.73.7"
}, {
    "id": 35,
    "first_name": "Araldo",
    "last_name": "Boscott",
    "email": "aboscotty@lycos.com",
    "gender": "Male",
    "ip_address": "249.88.70.237"
}, {
    "id": 36,
    "first_name": "Annabel",
    "last_name": "Bulcroft",
    "email": "abulcroftz@hp.com",
    "gender": "Bigender",
    "ip_address": "167.31.87.189"
}, {
    "id": 37,
    "first_name": "Kelly",
    "last_name": "Shelmardine",
    "email": "kshelmardine10@wix.com",
    "gender": "Male",
    "ip_address": "175.27.10.194"
}, {
    "id": 38,
    "first_name": "Addi",
    "last_name": "Limpenny",
    "email": "alimpenny11@cafepress.com",
    "gender": "Female",
    "ip_address": "101.72.49.116"
}, {
    "id": 39,
    "first_name": "Octavius",
    "last_name": "Lefridge",
    "email": "olefridge12@free.fr",
    "gender": "Male",
    "ip_address": "197.19.140.235"
}, {
    "id": 40,
    "first_name": "Crystie",
    "last_name": "Brangan",
    "email": "cbrangan13@artisteer.com",
    "gender": "Female",
    "ip_address": "240.164.158.192"
}, {
    "id": 41,
    "first_name": "Avery",
    "last_name": "Bingham",
    "email": "abingham14@smh.com.au",
    "gender": "Male",
    "ip_address": "189.107.199.249"
}, {
    "id": 42,
    "first_name": "Maye",
    "last_name": "Deverale",
    "email": "mdeverale15@godaddy.com",
    "gender": "Female",
    "ip_address": "133.69.127.125"
}, {
    "id": 43,
    "first_name": "Julio",
    "last_name": "Rodrigo",
    "email": "jrodrigo16@ustream.tv",
    "gender": "Male",
    "ip_address": "109.102.198.63"
}, {
    "id": 44,
    "first_name": "Bourke",
    "last_name": "Christofe",
    "email": "bchristofe17@tuttocitta.it",
    "gender": "Male",
    "ip_address": "9.118.103.217"
}, {
    "id": 45,
    "first_name": "Rosemary",
    "last_name": "Lauderdale",
    "email": "rlauderdale18@ebay.co.uk",
    "gender": "Polygender",
    "ip_address": "26.251.98.198"
}, {
    "id": 46,
    "first_name": "Rutledge",
    "last_name": "Freddi",
    "email": "rfreddi19@globo.com",
    "gender": "Male",
    "ip_address": "117.122.224.156"
}, {
    "id": 47,
    "first_name": "Felisha",
    "last_name": "Southwood",
    "email": "fsouthwood1a@forbes.com",
    "gender": "Female",
    "ip_address": "175.149.232.48"
}, {
    "id": 48,
    "first_name": "Bobby",
    "last_name": "Vinick",
    "email": "bvinick1b@paginegialle.it",
    "gender": "Male",
    "ip_address": "108.34.116.233"
}, {
    "id": 49,
    "first_name": "Gilli",
    "last_name": "Sails",
    "email": "gsails1c@goo.ne.jp",
    "gender": "Female",
    "ip_address": "111.216.175.152"
}, {
    "id": 50,
    "first_name": "Jedediah",
    "last_name": "Todman",
    "email": "jtodman1d@noaa.gov",
    "gender": "Male",
    "ip_address": "248.32.139.94"
}, {
    "id": 51,
    "first_name": "Edward",
    "last_name": "Dean",
    "email": "edean1e@baidu.com",
    "gender": "Male",
    "ip_address": "158.157.0.29"
}, {
    "id": 52,
    "first_name": "Elaine",
    "last_name": "Harrod",
    "email": "eharrod1f@cmu.edu",
    "gender": "Female",
    "ip_address": "222.103.141.173"
}, {
    "id": 53,
    "first_name": "Leopold",
    "last_name": "Allender",
    "email": "lallender1g@hp.com",
    "gender": "Male",
    "ip_address": "86.108.76.133"
}, {
    "id": 54,
    "first_name": "Kinny",
    "last_name": "Lidyard",
    "email": "klidyard1h@mediafire.com",
    "gender": "Male",
    "ip_address": "91.219.70.54"
}, {
    "id": 55,
    "first_name": "Leoline",
    "last_name": "Ruggen",
    "email": "lruggen1i@ft.com",
    "gender": "Female",
    "ip_address": "131.225.149.143"
}, {
    "id": 56,
    "first_name": "Feliks",
    "last_name": "Dwire",
    "email": "fdwire1j@wikimedia.org",
    "gender": "Male",
    "ip_address": "181.183.40.220"
}, {
    "id": 57,
    "first_name": "Leeland",
    "last_name": "Vasyanin",
    "email": "lvasyanin1k@cnet.com",
    "gender": "Genderqueer",
    "ip_address": "195.201.156.171"
}, {
    "id": 58,
    "first_name": "Obed",
    "last_name": "Luberto",
    "email": "oluberto1l@wufoo.com",
    "gender": "Male",
    "ip_address": "73.100.225.71"
}, {
    "id": 59,
    "first_name": "Cookie",
    "last_name": "Carbine",
    "email": "ccarbine1m@wp.com",
    "gender": "Genderqueer",
    "ip_address": "42.33.239.200"
}, {
    "id": 60,
    "first_name": "Clay",
    "last_name": "Benediktsson",
    "email": "cbenediktsson1n@google.com.au",
    "gender": "Male",
    "ip_address": "43.81.44.237"
}, {
    "id": 61,
    "first_name": "Harlan",
    "last_name": "MacCurley",
    "email": "hmaccurley1o@bravesites.com",
    "gender": "Non-binary",
    "ip_address": "63.185.255.74"
}, {
    "id": 62,
    "first_name": "Dulcia",
    "last_name": "Rowlin",
    "email": "drowlin1p@va.gov",
    "gender": "Female",
    "ip_address": "24.209.168.81"
}, {
    "id": 63,
    "first_name": "Eb",
    "last_name": "Storey",
    "email": "estorey1q@columbia.edu",
    "gender": "Male",
    "ip_address": "29.192.223.65"
}, {
    "id": 64,
    "first_name": "Marje",
    "last_name": "Corr",
    "email": "mcorr1r@wix.com",
    "gender": "Female",
    "ip_address": "54.41.187.139"
}, {
    "id": 65,
    "first_name": "Paolina",
    "last_name": "Woolley",
    "email": "pwoolley1s@redcross.org",
    "gender": "Female",
    "ip_address": "215.190.29.183"
}, {
    "id": 66,
    "first_name": "Mallissa",
    "last_name": "Minchi",
    "email": "mminchi1t@wufoo.com",
    "gender": "Female",
    "ip_address": "64.38.103.64"
}, {
    "id": 67,
    "first_name": "Joya",
    "last_name": "Krolak",
    "email": "jkrolak1u@t-online.de",
    "gender": "Female",
    "ip_address": "63.112.104.95"
}, {
    "id": 68,
    "first_name": "Editha",
    "last_name": "Munkley",
    "email": "emunkley1v@tumblr.com",
    "gender": "Female",
    "ip_address": "102.116.163.145"
}, {
    "id": 69,
    "first_name": "Othilie",
    "last_name": "Hales",
    "email": "ohales1w@homestead.com",
    "gender": "Female",
    "ip_address": "154.166.21.50"
}, {
    "id": 70,
    "first_name": "Grenville",
    "last_name": "Cankett",
    "email": "gcankett1x@phoca.cz",
    "gender": "Bigender",
    "ip_address": "212.122.117.208"
}, {
    "id": 71,
    "first_name": "Herc",
    "last_name": "De Avenell",
    "email": "hdeavenell1y@google.fr",
    "gender": "Male",
    "ip_address": "73.179.2.127"
}, {
    "id": 72,
    "first_name": "Giusto",
    "last_name": "Limerick",
    "email": "glimerick1z@barnesandnoble.com",
    "gender": "Male",
    "ip_address": "218.149.200.120"
}, {
    "id": 73,
    "first_name": "Martainn",
    "last_name": "Swales",
    "email": "mswales20@booking.com",
    "gender": "Male",
    "ip_address": "183.59.14.16"
}, {
    "id": 74,
    "first_name": "Paulina",
    "last_name": "Djurdjevic",
    "email": "pdjurdjevic21@noaa.gov",
    "gender": "Female",
    "ip_address": "115.204.142.41"
}, {
    "id": 75,
    "first_name": "Kelsi",
    "last_name": "Cassimer",
    "email": "kcassimer22@pinterest.com",
    "gender": "Bigender",
    "ip_address": "102.40.112.139"
}, {
    "id": 76,
    "first_name": "Cosetta",
    "last_name": "Hourigan",
    "email": "chourigan23@miitbeian.gov.cn",
    "gender": "Bigender",
    "ip_address": "9.91.61.176"
}, {
    "id": 77,
    "first_name": "Deina",
    "last_name": "Branca",
    "email": "dbranca24@soup.io",
    "gender": "Female",
    "ip_address": "43.130.125.21"
}, {
    "id": 78,
    "first_name": "Dougie",
    "last_name": "Jouanot",
    "email": "djouanot25@technorati.com",
    "gender": "Male",
    "ip_address": "73.167.61.233"
}, {
    "id": 79,
    "first_name": "Dru",
    "last_name": "Pepys",
    "email": "dpepys26@bbb.org",
    "gender": "Genderfluid",
    "ip_address": "77.2.29.167"
}, {
    "id": 80,
    "first_name": "Winona",
    "last_name": "Twinbrow",
    "email": "wtwinbrow27@deliciousdays.com",
    "gender": "Female",
    "ip_address": "99.203.207.169"
}, {
    "id": 81,
    "first_name": "Sloane",
    "last_name": "Beaston",
    "email": "sbeaston28@imdb.com",
    "gender": "Male",
    "ip_address": "85.25.195.178"
}, {
    "id": 82,
    "first_name": "Martyn",
    "last_name": "Becker",
    "email": "mbecker29@wp.com",
    "gender": "Male",
    "ip_address": "37.1.68.8"
}, {
    "id": 83,
    "first_name": "Cosette",
    "last_name": "Pardi",
    "email": "cpardi2a@soundcloud.com",
    "gender": "Female",
    "ip_address": "191.61.103.116"
}, {
    "id": 84,
    "first_name": "Cordy",
    "last_name": "Maccrea",
    "email": "cmaccrea2b@engadget.com",
    "gender": "Male",
    "ip_address": "157.211.46.78"
}, {
    "id": 85,
    "first_name": "Demetria",
    "last_name": "Moiser",
    "email": "dmoiser2c@tmall.com",
    "gender": "Female",
    "ip_address": "102.213.159.15"
}, {
    "id": 86,
    "first_name": "Dennison",
    "last_name": "Swansborough",
    "email": "dswansborough2d@angelfire.com",
    "gender": "Male",
    "ip_address": "21.2.77.50"
}, {
    "id": 87,
    "first_name": "Franni",
    "last_name": "Pressman",
    "email": "fpressman2e@discuz.net",
    "gender": "Female",
    "ip_address": "244.211.95.59"
}, {
    "id": 88,
    "first_name": "Karly",
    "last_name": "Mithun",
    "email": "kmithun2f@mayoclinic.com",
    "gender": "Female",
    "ip_address": "230.189.74.89"
}, {
    "id": 89,
    "first_name": "Frants",
    "last_name": "Curtayne",
    "email": "fcurtayne2g@feedburner.com",
    "gender": "Male",
    "ip_address": "203.44.191.84"
}, {
    "id": 90,
    "first_name": "Jarib",
    "last_name": "Beiderbeck",
    "email": "jbeiderbeck2h@blogs.com",
    "gender": "Male",
    "ip_address": "70.104.155.137"
}, {
    "id": 91,
    "first_name": "Hector",
    "last_name": "Botly",
    "email": "hbotly2i@yelp.com",
    "gender": "Male",
    "ip_address": "217.186.11.64"
}, {
    "id": 92,
    "first_name": "Aurthur",
    "last_name": "Pughe",
    "email": "apughe2j@yale.edu",
    "gender": "Male",
    "ip_address": "234.217.255.209"
}, {
    "id": 93,
    "first_name": "Blair",
    "last_name": "Bert",
    "email": "bbert2k@loc.gov",
    "gender": "Male",
    "ip_address": "232.60.171.211"
}, {
    "id": 94,
    "first_name": "Dael",
    "last_name": "Forlong",
    "email": "dforlong2l@whitehouse.gov",
    "gender": "Female",
    "ip_address": "33.171.225.6"
}, {
    "id": 95,
    "first_name": "Corissa",
    "last_name": "Duckels",
    "email": "cduckels2m@cpanel.net",
    "gender": "Female",
    "ip_address": "49.63.201.152"
}, {
    "id": 96,
    "first_name": "Piper",
    "last_name": "Fradson",
    "email": "pfradson2n@php.net",
    "gender": "Female",
    "ip_address": "164.79.234.114"
}, {
    "id": 97,
    "first_name": "Alexander",
    "last_name": "Burdass",
    "email": "aburdass2o@google.fr",
    "gender": "Male",
    "ip_address": "57.223.178.196"
}, {
    "id": 98,
    "first_name": "Corabel",
    "last_name": "Foister",
    "email": "cfoister2p@toplist.cz",
    "gender": "Female",
    "ip_address": "132.21.57.70"
}, {
    "id": 99,
    "first_name": "Kearney",
    "last_name": "Mutlow",
    "email": "kmutlow2q@si.edu",
    "gender": "Male",
    "ip_address": "195.80.114.188"
}, {
    "id": 100,
    "first_name": "Enrika",
    "last_name": "Lethlay",
    "email": "elethlay2r@cnet.com",
    "gender": "Female",
    "ip_address": "25.204.42.165"
}]

let cartItems = []
let value1 = data.find((v=>v.id=="30"))
let value2 = data.find((v=>v.id=="40"))
cartItems.push(value1)
cartItems.push(value2)
console.log(cartItems);

//? filter return array which is created implicitly

//! Revision Of Higher Order Function