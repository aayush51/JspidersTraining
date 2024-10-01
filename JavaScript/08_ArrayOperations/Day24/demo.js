let arr1 = [10, 20, 30, 40, 50, 60, 70]
// for(let i = 0 ; i< arr1.length ; i++){
//     console.log(arr1[i]);
// }

// arr1.forEach((e) => {
//     console.log(e);
// });

arr1.forEach((e, i, a) => {
    console.log("Element :", e, " Index :", i, " Array :", a);
});

// Mockapi
let data = [
    {
        "name": "Rachael Heidenreich II",
        "address": "Castro Valley",
        "contact": "731-752-3694",
        "id": "1"
    },
    {
        "name": "Margarita Orn",
        "address": "Bellingham",
        "contact": "564-570-5825",
        "id": "2"
    },
    {
        "name": "Dolores Volkman",
        "address": "San Juan",
        "contact": "713-236-7049",
        "id": "3"
    },
    {
        "name": "Mr. Cedric Herman",
        "address": "Charlottesville",
        "contact": "265-905-6560",
        "id": "4"
    },
    {
        "name": "Lillian Ortiz",
        "address": "West Allis",
        "contact": "944-740-5686",
        "id": "5"
    },
    {
        "name": "Kerry Bruen",
        "address": "Youngstown",
        "contact": "201-377-9722",
        "id": "6"
    },
    {
        "name": "Clifford Dach",
        "address": "Smyrna",
        "contact": "895-201-0615",
        "id": "7"
    },
    {
        "name": "Lionel Toy",
        "address": "Grand Prairie",
        "contact": "507-897-8309",
        "id": "8"
    },
    {
        "name": "Alison Murphy",
        "address": "Ashburn",
        "contact": "895-891-6330",
        "id": "9"
    },
    {
        "name": "Elias Blick",
        "address": "North Richland Hills",
        "contact": "733-971-0546",
        "id": "10"
    },
    {
        "name": "Holly Green",
        "address": "Cambridge",
        "contact": "795-980-3173",
        "id": "11"
    },
    {
        "name": "Edwin Tremblay",
        "address": "Pittsburgh",
        "contact": "285-450-6207",
        "id": "12"
    },
    {
        "name": "Marcella Reilly",
        "address": "Coachella",
        "contact": "967-213-3477",
        "id": "13"
    },
    {
        "name": "Damon Kiehn",
        "address": "Cranston",
        "contact": "957-683-8460",
        "id": "14"
    },
    {
        "name": "Dr. Arthur Purdy",
        "address": "Diamond Bar",
        "contact": "954-702-6138",
        "id": "15"
    },
    {
        "name": "Valerie Walsh",
        "address": "Casper",
        "contact": "785-760-1259",
        "id": "16"
    },
    {
        "name": "Joseph Goyette",
        "address": "Clifton",
        "contact": "822-410-0052",
        "id": "17"
    },
    {
        "name": "Lucy Conroy",
        "address": "Racine",
        "contact": "366-870-7837",
        "id": "18"
    },
    {
        "name": "George Jast I",
        "address": "Newport News",
        "contact": "477-853-8444",
        "id": "19"
    },
    {
        "name": "Winston Schuppe",
        "address": "Racine",
        "contact": "869-201-4056",
        "id": "20"
    },
    {
        "name": "Amber Steuber",
        "address": "Blue Springs",
        "contact": "571-772-8750",
        "id": "21"
    },
    {
        "name": "Miguel Wiegand",
        "address": "Rocklin",
        "contact": "680-320-0733",
        "id": "22"
    },
    {
        "name": "Karl Oberbrunner",
        "address": "Pinellas Park",
        "contact": "449-955-6749",
        "id": "23"
    },
    {
        "name": "Dr. Peggy Hickle",
        "address": "Tyler",
        "contact": "514-455-5194",
        "id": "24"
    },
    {
        "name": "Miss Roman Stiedemann",
        "address": "Pasco",
        "contact": "636-389-0698",
        "id": "25"
    },
    {
        "name": "Erik Stokes",
        "address": "Antioch",
        "contact": "727-569-5682",
        "id": "26"
    },
    {
        "name": "Ashley Haag DDS",
        "address": "Tucson",
        "contact": "311-450-9779",
        "id": "27"
    },
    {
        "name": "Kelli Toy",
        "address": "Sterling Heights",
        "contact": "322-446-6009",
        "id": "28"
    },
    {
        "name": "Darren Mayert II",
        "address": "Dallas",
        "contact": "860-692-1909",
        "id": "29"
    },
    {
        "name": "Tyrone McLaughlin",
        "address": "Gary",
        "contact": "201-409-8322",
        "id": "30"
    },
    {
        "name": "Jody Schmidt",
        "address": "Miami",
        "contact": "899-378-0873",
        "id": "31"
    },
    {
        "name": "Wilfred Windler",
        "address": "Corvallis",
        "contact": "551-901-9086",
        "id": "32"
    },
    {
        "name": "Rochelle Carroll",
        "address": "Kendale Lakes",
        "contact": "405-854-2799",
        "id": "33"
    },
    {
        "name": "Natalie Nader",
        "address": "Fort Lauderdale",
        "contact": "969-504-9965",
        "id": "34"
    },
    {
        "name": "Fred Friesen III",
        "address": "Everett",
        "contact": "690-511-6094",
        "id": "35"
    },
    {
        "name": "Andy Toy I",
        "address": "Bethesda",
        "contact": "493-620-1117",
        "id": "36"
    },
    {
        "name": "Emma Cassin",
        "address": "Schaumburg",
        "contact": "848-766-6825",
        "id": "37"
    },
    {
        "name": "Carol Lowe",
        "address": "Tinley Park",
        "contact": "460-687-5710",
        "id": "38"
    },
    {
        "name": "Amos Simonis",
        "address": "Berwyn",
        "contact": "522-329-6541",
        "id": "39"
    },
    {
        "name": "Lynne Lynch",
        "address": "Sparks",
        "contact": "343-556-2640",
        "id": "40"
    },
    {
        "name": "Mr. Melinda Gleichner",
        "address": "League City",
        "contact": "500-331-6393",
        "id": "41"
    },
    {
        "name": "Brittany Gerhold",
        "address": "Memphis",
        "contact": "488-989-2442",
        "id": "42"
    },
    {
        "name": "Ricardo Goyette",
        "address": "Centennial",
        "contact": "842-436-6839",
        "id": "43"
    },
    {
        "name": "Sidney Stracke",
        "address": "Coral Gables",
        "contact": "721-608-4321",
        "id": "44"
    },
    {
        "name": "Shaun Wiza",
        "address": "Youngstown",
        "contact": "730-786-3104",
        "id": "45"
    },
    {
        "name": "Ms. Gertrude Muller",
        "address": "Portage",
        "contact": "301-657-5257",
        "id": "46"
    },
    {
        "name": "Eunice Hessel",
        "address": "Yuma",
        "contact": "220-885-7261",
        "id": "47"
    },
    {
        "name": "Freddie Ferry MD",
        "address": "West New York",
        "contact": "532-378-9029",
        "id": "48"
    },
    {
        "name": "Rick Schumm",
        "address": "Allen",
        "contact": "560-314-8101",
        "id": "49"
    },
    {
        "name": "Christina Koss II",
        "address": "Lynwood",
        "contact": "622-366-9398",
        "id": "50"
    },
    {
        "name": "Mr. Meredith Steuber I",
        "address": "Pasco",
        "contact": "433-367-3825",
        "id": "51"
    },
    {
        "name": "Georgia Predovic",
        "address": "Caguas",
        "contact": "874-360-8836",
        "id": "52"
    },
    {
        "name": "Dr. Edgar King",
        "address": "Casas Adobes",
        "contact": "209-691-3221",
        "id": "53"
    },
    {
        "name": "Elias Williamson",
        "address": "The Villages",
        "contact": "545-380-6282",
        "id": "54"
    },
    {
        "name": "Misty Kihn",
        "address": "Omaha",
        "contact": "914-990-1698",
        "id": "55"
    },
    {
        "name": "Laurence Mosciski",
        "address": "Round Rock",
        "contact": "524-421-7566",
        "id": "56"
    },
    {
        "name": "Tricia Kunze",
        "address": "Melbourne",
        "contact": "336-967-1119",
        "id": "57"
    },
    {
        "name": "Jenny Corkery",
        "address": "Largo",
        "contact": "914-737-6651",
        "id": "58"
    },
    {
        "name": "Mr. Silvia Lueilwitz",
        "address": "Fremont",
        "contact": "546-802-5151",
        "id": "59"
    },
    {
        "name": "Lynne Reinger",
        "address": "Carson City",
        "contact": "924-423-3635",
        "id": "60"
    },
    {
        "name": "George Jakubowski MD",
        "address": "Apopka",
        "contact": "734-880-7920",
        "id": "61"
    },
    {
        "name": "Courtney Schuster",
        "address": "Salinas",
        "contact": "204-845-2745",
        "id": "62"
    },
    {
        "name": "Verna Blanda",
        "address": "Poinciana",
        "contact": "454-961-4079",
        "id": "63"
    },
    {
        "name": "Mr. Shelly Tillman III",
        "address": "Catonsville",
        "contact": "956-492-9802",
        "id": "64"
    },
    {
        "name": "Israel Sanford",
        "address": "Vallejo",
        "contact": "329-641-7177",
        "id": "65"
    },
    {
        "name": "Sylvia Koelpin",
        "address": "Grand Prairie",
        "contact": "505-788-3374",
        "id": "66"
    },
    {
        "name": "Morris Powlowski",
        "address": "Coral Gables",
        "contact": "845-647-4793",
        "id": "67"
    },
    {
        "name": "John Crist",
        "address": "Burke",
        "contact": "554-634-1776",
        "id": "68"
    },
    {
        "name": "James Mann",
        "address": "Southaven",
        "contact": "482-775-6017",
        "id": "69"
    },
    {
        "name": "Orlando Jast",
        "address": "Shoreline",
        "contact": "389-571-3278",
        "id": "70"
    },
    {
        "name": "Eric Conroy",
        "address": "Detroit",
        "contact": "312-869-4219",
        "id": "71"
    },
    {
        "name": "Dr. Terry Walter",
        "address": "Worcester",
        "contact": "876-982-7266",
        "id": "72"
    },
    {
        "name": "Clarence MacGyver",
        "address": "Redondo Beach",
        "contact": "804-535-8776",
        "id": "73"
    },
    {
        "name": "Taylor Corkery",
        "address": "Oak Park",
        "contact": "262-921-2949",
        "id": "74"
    },
    {
        "name": "Eleanor Parisian",
        "address": "Redlands",
        "contact": "498-343-4995",
        "id": "75"
    },
    {
        "name": "Salvador Kerluke",
        "address": "Hoffman Estates",
        "contact": "245-366-8831",
        "id": "76"
    },
    {
        "name": "Mr. Sabrina Conroy",
        "address": "Haverhill",
        "contact": "704-259-3699",
        "id": "77"
    },
    {
        "name": "Toni Bode",
        "address": "Tuckahoe",
        "contact": "712-312-0557",
        "id": "78"
    },
    {
        "name": "Dr. Russell Oberbrunner",
        "address": "Ontario",
        "contact": "934-575-4731",
        "id": "79"
    },
    {
        "name": "Mitchell Emmerich",
        "address": "Evanston",
        "contact": "571-220-2695",
        "id": "80"
    },
    {
        "name": "Bethany Reilly",
        "address": "South Whittier",
        "contact": "797-352-9353",
        "id": "81"
    },
    {
        "name": "Marjorie Shanahan",
        "address": "La Habra",
        "contact": "668-467-4559",
        "id": "82"
    },
    {
        "name": "Ms. Inez Emmerich",
        "address": "Eugene",
        "contact": "730-973-2558",
        "id": "83"
    },
    {
        "name": "Rufus Hand",
        "address": "Lakeland",
        "contact": "697-958-9175",
        "id": "84"
    },
    {
        "name": "Mr. Taylor VonRueden",
        "address": "Rockwall",
        "contact": "898-359-8932",
        "id": "85"
    },
    {
        "name": "Jason Franecki",
        "address": "Marietta",
        "contact": "589-891-7419",
        "id": "86"
    },
    {
        "name": "Roosevelt Littel",
        "address": "Cypress",
        "contact": "238-593-5332",
        "id": "87"
    },
    {
        "name": "Geneva Langworth",
        "address": "Eden Prairie",
        "contact": "594-602-9178",
        "id": "88"
    },
    {
        "name": "Rogelio Armstrong",
        "address": "Moline",
        "contact": "759-745-3873",
        "id": "89"
    },
    {
        "name": "Dr. Laurence Konopelski",
        "address": "Eastvale",
        "contact": "251-274-0035",
        "id": "90"
    },
    {
        "name": "Loren Morissette",
        "address": "Milpitas",
        "contact": "570-483-0090",
        "id": "91"
    },
    {
        "name": "Malcolm McGlynn I",
        "address": "East Honolulu",
        "contact": "433-820-4187",
        "id": "92"
    },
    {
        "name": "Jean Daniel",
        "address": "Pasco",
        "contact": "918-483-2392",
        "id": "93"
    },
    {
        "name": "Clifton Beer",
        "address": "Redwood City",
        "contact": "707-851-2426",
        "id": "94"
    },
    {
        "name": "Danny Hegmann",
        "address": "Jeffersonville",
        "contact": "515-314-6800",
        "id": "95"
    },
    {
        "name": "Brendan Keebler",
        "address": "Chesapeake",
        "contact": "509-230-9616",
        "id": "96"
    },
    {
        "name": "Delbert Torp",
        "address": "Tamarac",
        "contact": "212-436-7593",
        "id": "97"
    },
    {
        "name": "Terrance Becker",
        "address": "Anchorage",
        "contact": "361-996-4596",
        "id": "98"
    },
    {
        "name": "Miss Wilson Braun",
        "address": "Troy",
        "contact": "591-617-3314",
        "id": "99"
    },
    {
        "name": "Vickie Hettinger",
        "address": "South Gate",
        "contact": "255-634-9593",
        "id": "100"
    }
]

// console.log(data[0].address);
// console.log(data[1].contact);
// console.log(data[2].name);

// for (let i = 0; i < data.length; i++) {
//     console.log(data[i].name);
// }

//mockaroo
let data1 = [{
    "id": 1,
    "first_name": "Leola",
    "last_name": "Thalmann",
    "email": "lthalmann0@sourceforge.net",
    "gender": "Female",
    "ip_address": "227.105.206.82"
}, {
    "id": 2,
    "first_name": "Gregoor",
    "last_name": "Forth",
    "email": "gforth1@latimes.com",
    "gender": "Male",
    "ip_address": "137.0.146.230"
}, {
    "id": 3,
    "first_name": "Gail",
    "last_name": "McKissack",
    "email": "gmckissack2@shop-pro.jp",
    "gender": "Female",
    "ip_address": "45.153.173.245"
}, {
    "id": 4,
    "first_name": "Beryl",
    "last_name": "Ceccoli",
    "email": "bceccoli3@shutterfly.com",
    "gender": "Female",
    "ip_address": "126.47.210.249"
}, {
    "id": 5,
    "first_name": "Druci",
    "last_name": "Kelly",
    "email": "dkelly4@sitemeter.com",
    "gender": "Female",
    "ip_address": "238.61.192.23"
}, {
    "id": 6,
    "first_name": "Peggy",
    "last_name": "Redmond",
    "email": "predmond5@ning.com",
    "gender": "Genderfluid",
    "ip_address": "4.96.140.102"
}, {
    "id": 7,
    "first_name": "Isabella",
    "last_name": "Bang",
    "email": "ibang6@ycombinator.com",
    "gender": "Female",
    "ip_address": "59.145.0.128"
}, {
    "id": 8,
    "first_name": "Carolus",
    "last_name": "Mant",
    "email": "cmant7@myspace.com",
    "gender": "Genderfluid",
    "ip_address": "236.74.244.207"
}, {
    "id": 9,
    "first_name": "Xerxes",
    "last_name": "Wrist",
    "email": "xwrist8@cbsnews.com",
    "gender": "Male",
    "ip_address": "56.119.172.51"
}, {
    "id": 10,
    "first_name": "Adey",
    "last_name": "Booth-Jarvis",
    "email": "aboothjarvis9@pen.io",
    "gender": "Female",
    "ip_address": "16.255.62.198"
}, {
    "id": 11,
    "first_name": "Kaile",
    "last_name": "Hoston",
    "email": "khostona@bloglines.com",
    "gender": "Female",
    "ip_address": "144.249.99.239"
}, {
    "id": 12,
    "first_name": "Karisa",
    "last_name": "Welling",
    "email": "kwellingb@discuz.net",
    "gender": "Female",
    "ip_address": "247.176.78.196"
}, {
    "id": 13,
    "first_name": "Katee",
    "last_name": "Bucknall",
    "email": "kbucknallc@fema.gov",
    "gender": "Female",
    "ip_address": "240.27.255.180"
}, {
    "id": 14,
    "first_name": "Gelya",
    "last_name": "Dalzell",
    "email": "gdalzelld@cnn.com",
    "gender": "Female",
    "ip_address": "62.11.73.220"
}, {
    "id": 15,
    "first_name": "Hedvige",
    "last_name": "Abramovitz",
    "email": "habramovitze@sun.com",
    "gender": "Female",
    "ip_address": "64.89.45.187"
}, {
    "id": 16,
    "first_name": "Etty",
    "last_name": "Ainger",
    "email": "eaingerf@blogger.com",
    "gender": "Female",
    "ip_address": "125.98.41.142"
}, {
    "id": 17,
    "first_name": "Madlin",
    "last_name": "Murcott",
    "email": "mmurcottg@jigsy.com",
    "gender": "Female",
    "ip_address": "190.91.86.57"
}, {
    "id": 18,
    "first_name": "Emelen",
    "last_name": "MacAne",
    "email": "emacaneh@domainmarket.com",
    "gender": "Male",
    "ip_address": "123.79.200.211"
}, {
    "id": 19,
    "first_name": "Dayle",
    "last_name": "Ashforth",
    "email": "dashforthi@msu.edu",
    "gender": "Female",
    "ip_address": "201.217.175.208"
}, {
    "id": 20,
    "first_name": "Kip",
    "last_name": "Begbie",
    "email": "kbegbiej@wunderground.com",
    "gender": "Female",
    "ip_address": "143.188.192.223"
}, {
    "id": 21,
    "first_name": "Elston",
    "last_name": "Soares",
    "email": "esoaresk@ezinearticles.com",
    "gender": "Male",
    "ip_address": "244.113.75.195"
}, {
    "id": 22,
    "first_name": "Eolanda",
    "last_name": "Hansberry",
    "email": "ehansberryl@surveymonkey.com",
    "gender": "Female",
    "ip_address": "189.62.247.220"
}, {
    "id": 23,
    "first_name": "Abagail",
    "last_name": "Pankethman",
    "email": "apankethmanm@google.ru",
    "gender": "Female",
    "ip_address": "234.49.17.51"
}, {
    "id": 24,
    "first_name": "Davide",
    "last_name": "Buddington",
    "email": "dbuddingtonn@newsvine.com",
    "gender": "Male",
    "ip_address": "236.161.11.178"
}, {
    "id": 25,
    "first_name": "Eachelle",
    "last_name": "Salmond",
    "email": "esalmondo@skyrock.com",
    "gender": "Female",
    "ip_address": "67.248.43.45"
}, {
    "id": 26,
    "first_name": "Petey",
    "last_name": "Benka",
    "email": "pbenkap@icio.us",
    "gender": "Male",
    "ip_address": "186.49.129.220"
}, {
    "id": 27,
    "first_name": "Vannie",
    "last_name": "McClinton",
    "email": "vmcclintonq@cyberchimps.com",
    "gender": "Female",
    "ip_address": "60.254.15.1"
}, {
    "id": 28,
    "first_name": "Julianna",
    "last_name": "Cadalleder",
    "email": "jcadallederr@msu.edu",
    "gender": "Female",
    "ip_address": "164.159.114.247"
}, {
    "id": 29,
    "first_name": "Jaymie",
    "last_name": "Malyj",
    "email": "jmalyjs@forbes.com",
    "gender": "Male",
    "ip_address": "199.207.147.196"
}, {
    "id": 30,
    "first_name": "Wilbert",
    "last_name": "Kliche",
    "email": "wklichet@spiegel.de",
    "gender": "Male",
    "ip_address": "113.221.133.9"
}, {
    "id": 31,
    "first_name": "Rikki",
    "last_name": "Sparry",
    "email": "rsparryu@so-net.ne.jp",
    "gender": "Male",
    "ip_address": "94.191.96.254"
}, {
    "id": 32,
    "first_name": "Gardy",
    "last_name": "Sitwell",
    "email": "gsitwellv@nyu.edu",
    "gender": "Male",
    "ip_address": "44.19.225.78"
}, {
    "id": 33,
    "first_name": "Delila",
    "last_name": "Peperell",
    "email": "dpeperellw@tuttocitta.it",
    "gender": "Female",
    "ip_address": "239.29.249.240"
}, {
    "id": 34,
    "first_name": "Norbert",
    "last_name": "Anderbrugge",
    "email": "nanderbruggex@amazonaws.com",
    "gender": "Male",
    "ip_address": "183.106.103.253"
}, {
    "id": 35,
    "first_name": "Chen",
    "last_name": "Gimbrett",
    "email": "cgimbretty@hp.com",
    "gender": "Male",
    "ip_address": "70.221.4.156"
}, {
    "id": 36,
    "first_name": "Eran",
    "last_name": "Boodell",
    "email": "eboodellz@economist.com",
    "gender": "Female",
    "ip_address": "15.77.112.141"
}, {
    "id": 37,
    "first_name": "Dicky",
    "last_name": "Woodstock",
    "email": "dwoodstock10@rediff.com",
    "gender": "Male",
    "ip_address": "150.169.2.187"
}, {
    "id": 38,
    "first_name": "Alysa",
    "last_name": "Blaiklock",
    "email": "ablaiklock11@google.com.hk",
    "gender": "Polygender",
    "ip_address": "126.232.23.90"
}, {
    "id": 39,
    "first_name": "Yvette",
    "last_name": "Andreia",
    "email": "yandreia12@cnet.com",
    "gender": "Female",
    "ip_address": "146.150.97.202"
}, {
    "id": 40,
    "first_name": "Dru",
    "last_name": "Cardno",
    "email": "dcardno13@scientificamerican.com",
    "gender": "Genderqueer",
    "ip_address": "110.119.141.63"
}, {
    "id": 41,
    "first_name": "Christie",
    "last_name": "Boraston",
    "email": "cboraston14@delicious.com",
    "gender": "Male",
    "ip_address": "63.24.170.161"
}, {
    "id": 42,
    "first_name": "Fernande",
    "last_name": "Hurd",
    "email": "fhurd15@edublogs.org",
    "gender": "Female",
    "ip_address": "12.89.54.134"
}, {
    "id": 43,
    "first_name": "Loralee",
    "last_name": "Dewi",
    "email": "ldewi16@naver.com",
    "gender": "Female",
    "ip_address": "23.251.227.152"
}, {
    "id": 44,
    "first_name": "Burlie",
    "last_name": "Stairmand",
    "email": "bstairmand17@drupal.org",
    "gender": "Male",
    "ip_address": "158.108.60.30"
}, {
    "id": 45,
    "first_name": "Evelin",
    "last_name": "Harbottle",
    "email": "eharbottle18@feedburner.com",
    "gender": "Male",
    "ip_address": "116.9.66.184"
}, {
    "id": 46,
    "first_name": "Laural",
    "last_name": "Beach",
    "email": "lbeach19@sakura.ne.jp",
    "gender": "Female",
    "ip_address": "19.134.58.106"
}, {
    "id": 47,
    "first_name": "Iosep",
    "last_name": "Braysher",
    "email": "ibraysher1a@ow.ly",
    "gender": "Male",
    "ip_address": "229.245.125.190"
}, {
    "id": 48,
    "first_name": "Benny",
    "last_name": "Colson",
    "email": "bcolson1b@mysql.com",
    "gender": "Female",
    "ip_address": "28.44.216.209"
}, {
    "id": 49,
    "first_name": "Jordan",
    "last_name": "Prevett",
    "email": "jprevett1c@apache.org",
    "gender": "Male",
    "ip_address": "247.103.122.21"
}, {
    "id": 50,
    "first_name": "Zia",
    "last_name": "Winfred",
    "email": "zwinfred1d@ask.com",
    "gender": "Bigender",
    "ip_address": "193.38.173.98"
}, {
    "id": 51,
    "first_name": "Ulrike",
    "last_name": "Bortolotti",
    "email": "ubortolotti1e@google.pl",
    "gender": "Female",
    "ip_address": "41.13.213.217"
}, {
    "id": 52,
    "first_name": "Noemi",
    "last_name": "Bothe",
    "email": "nbothe1f@microsoft.com",
    "gender": "Female",
    "ip_address": "189.10.138.145"
}, {
    "id": 53,
    "first_name": "Ellyn",
    "last_name": "Aldrin",
    "email": "ealdrin1g@senate.gov",
    "gender": "Female",
    "ip_address": "175.73.239.214"
}, {
    "id": 54,
    "first_name": "Benito",
    "last_name": "Hampstead",
    "email": "bhampstead1h@tmall.com",
    "gender": "Male",
    "ip_address": "89.87.27.211"
}, {
    "id": 55,
    "first_name": "Calhoun",
    "last_name": "Middlemist",
    "email": "cmiddlemist1i@flavors.me",
    "gender": "Male",
    "ip_address": "73.100.54.6"
}, {
    "id": 56,
    "first_name": "Benedicta",
    "last_name": "Burlingame",
    "email": "bburlingame1j@amazon.co.uk",
    "gender": "Female",
    "ip_address": "46.113.59.56"
}, {
    "id": 57,
    "first_name": "Timi",
    "last_name": "Bordes",
    "email": "tbordes1k@timesonline.co.uk",
    "gender": "Female",
    "ip_address": "48.15.88.108"
}, {
    "id": 58,
    "first_name": "Quincy",
    "last_name": "Climance",
    "email": "qclimance1l@tuttocitta.it",
    "gender": "Genderfluid",
    "ip_address": "161.229.250.195"
}, {
    "id": 59,
    "first_name": "Jenny",
    "last_name": "Burnes",
    "email": "jburnes1m@independent.co.uk",
    "gender": "Female",
    "ip_address": "161.177.244.78"
}, {
    "id": 60,
    "first_name": "Willie",
    "last_name": "Pittle",
    "email": "wpittle1n@bloglines.com",
    "gender": "Male",
    "ip_address": "8.112.135.14"
}, {
    "id": 61,
    "first_name": "Lise",
    "last_name": "Joney",
    "email": "ljoney1o@reddit.com",
    "gender": "Female",
    "ip_address": "152.138.251.75"
}, {
    "id": 62,
    "first_name": "Trish",
    "last_name": "Henryson",
    "email": "thenryson1p@yale.edu",
    "gender": "Female",
    "ip_address": "163.171.107.228"
}, {
    "id": 63,
    "first_name": "Melisse",
    "last_name": "McDoual",
    "email": "mmcdoual1q@ucsd.edu",
    "gender": "Female",
    "ip_address": "228.128.191.107"
}, {
    "id": 64,
    "first_name": "Annemarie",
    "last_name": "Oldrey",
    "email": "aoldrey1r@reference.com",
    "gender": "Polygender",
    "ip_address": "142.146.234.117"
}, {
    "id": 65,
    "first_name": "Wylie",
    "last_name": "Rubrow",
    "email": "wrubrow1s@deviantart.com",
    "gender": "Male",
    "ip_address": "130.1.210.238"
}, {
    "id": 66,
    "first_name": "Alberik",
    "last_name": "Chance",
    "email": "achance1t@sciencedirect.com",
    "gender": "Male",
    "ip_address": "34.6.230.191"
}, {
    "id": 67,
    "first_name": "Sephira",
    "last_name": "Lewknor",
    "email": "slewknor1u@devhub.com",
    "gender": "Female",
    "ip_address": "228.235.206.32"
}, {
    "id": 68,
    "first_name": "Tremaine",
    "last_name": "Krink",
    "email": "tkrink1v@parallels.com",
    "gender": "Polygender",
    "ip_address": "114.96.205.167"
}, {
    "id": 69,
    "first_name": "Joye",
    "last_name": "O'Reilly",
    "email": "joreilly1w@dailymotion.com",
    "gender": "Female",
    "ip_address": "191.234.245.7"
}, {
    "id": 70,
    "first_name": "Larisa",
    "last_name": "Haxley",
    "email": "lhaxley1x@myspace.com",
    "gender": "Agender",
    "ip_address": "143.190.58.99"
}, {
    "id": 71,
    "first_name": "Max",
    "last_name": "Simao",
    "email": "msimao1y@posterous.com",
    "gender": "Female",
    "ip_address": "66.163.227.48"
}, {
    "id": 72,
    "first_name": "Cesya",
    "last_name": "Moehler",
    "email": "cmoehler1z@is.gd",
    "gender": "Female",
    "ip_address": "33.20.186.204"
}, {
    "id": 73,
    "first_name": "Matthias",
    "last_name": "Stanesby",
    "email": "mstanesby20@woothemes.com",
    "gender": "Agender",
    "ip_address": "208.172.39.52"
}, {
    "id": 74,
    "first_name": "Deonne",
    "last_name": "Kinder",
    "email": "dkinder21@arizona.edu",
    "gender": "Female",
    "ip_address": "214.237.104.128"
}, {
    "id": 75,
    "first_name": "Georgie",
    "last_name": "Judron",
    "email": "gjudron22@narod.ru",
    "gender": "Male",
    "ip_address": "225.213.32.154"
}, {
    "id": 76,
    "first_name": "Nichole",
    "last_name": "Sheerman",
    "email": "nsheerman23@usnews.com",
    "gender": "Male",
    "ip_address": "48.250.94.117"
}, {
    "id": 77,
    "first_name": "Levey",
    "last_name": "Himpson",
    "email": "lhimpson24@unesco.org",
    "gender": "Male",
    "ip_address": "250.25.156.162"
}, {
    "id": 78,
    "first_name": "Audrey",
    "last_name": "Buzine",
    "email": "abuzine25@sciencedirect.com",
    "gender": "Bigender",
    "ip_address": "198.190.222.85"
}, {
    "id": 79,
    "first_name": "Cullen",
    "last_name": "Dodsworth",
    "email": "cdodsworth26@hatena.ne.jp",
    "gender": "Male",
    "ip_address": "31.36.250.167"
}, {
    "id": 80,
    "first_name": "Bordy",
    "last_name": "Beldam",
    "email": "bbeldam27@macromedia.com",
    "gender": "Male",
    "ip_address": "9.192.17.53"
}, {
    "id": 81,
    "first_name": "Darn",
    "last_name": "Druce",
    "email": "ddruce28@businessinsider.com",
    "gender": "Male",
    "ip_address": "190.13.249.245"
}, {
    "id": 82,
    "first_name": "Rik",
    "last_name": "Buckthorp",
    "email": "rbuckthorp29@wikispaces.com",
    "gender": "Male",
    "ip_address": "203.10.185.10"
}, {
    "id": 83,
    "first_name": "Roz",
    "last_name": "Shearman",
    "email": "rshearman2a@businessinsider.com",
    "gender": "Female",
    "ip_address": "237.171.69.220"
}, {
    "id": 84,
    "first_name": "Pauletta",
    "last_name": "Bembrick",
    "email": "pbembrick2b@istockphoto.com",
    "gender": "Female",
    "ip_address": "80.60.34.163"
}, {
    "id": 85,
    "first_name": "Royce",
    "last_name": "Ozanne",
    "email": "rozanne2c@latimes.com",
    "gender": "Male",
    "ip_address": "230.231.143.50"
}, {
    "id": 86,
    "first_name": "Lanny",
    "last_name": "Tune",
    "email": "ltune2d@un.org",
    "gender": "Male",
    "ip_address": "101.65.169.176"
}, {
    "id": 87,
    "first_name": "Masha",
    "last_name": "Hacking",
    "email": "mhacking2e@globo.com",
    "gender": "Female",
    "ip_address": "246.186.146.159"
}, {
    "id": 88,
    "first_name": "Skipton",
    "last_name": "Malkinson",
    "email": "smalkinson2f@netvibes.com",
    "gender": "Male",
    "ip_address": "146.49.198.242"
}, {
    "id": 89,
    "first_name": "Leonid",
    "last_name": "Blaschek",
    "email": "lblaschek2g@51.la",
    "gender": "Male",
    "ip_address": "129.202.150.143"
}, {
    "id": 90,
    "first_name": "Edith",
    "last_name": "Ketch",
    "email": "eketch2h@123-reg.co.uk",
    "gender": "Female",
    "ip_address": "86.107.69.173"
}, {
    "id": 91,
    "first_name": "Sky",
    "last_name": "Heams",
    "email": "sheams2i@ebay.co.uk",
    "gender": "Male",
    "ip_address": "182.78.173.20"
}, {
    "id": 92,
    "first_name": "Sadella",
    "last_name": "Brigstock",
    "email": "sbrigstock2j@last.fm",
    "gender": "Female",
    "ip_address": "133.71.244.156"
}, {
    "id": 93,
    "first_name": "Horace",
    "last_name": "Farries",
    "email": "hfarries2k@umn.edu",
    "gender": "Male",
    "ip_address": "192.8.241.59"
}, {
    "id": 94,
    "first_name": "Floria",
    "last_name": "Fulstow",
    "email": "ffulstow2l@weebly.com",
    "gender": "Female",
    "ip_address": "166.176.67.23"
}, {
    "id": 95,
    "first_name": "Nanine",
    "last_name": "Dehm",
    "email": "ndehm2m@hao123.com",
    "gender": "Female",
    "ip_address": "55.97.18.20"
}, {
    "id": 96,
    "first_name": "Donnajean",
    "last_name": "Posvner",
    "email": "dposvner2n@myspace.com",
    "gender": "Female",
    "ip_address": "145.52.109.97"
}, {
    "id": 97,
    "first_name": "Mead",
    "last_name": "Castagnasso",
    "email": "mcastagnasso2o@nps.gov",
    "gender": "Male",
    "ip_address": "67.100.66.234"
}, {
    "id": 98,
    "first_name": "Sigmund",
    "last_name": "Beadle",
    "email": "sbeadle2p@myspace.com",
    "gender": "Male",
    "ip_address": "241.220.193.143"
}, {
    "id": 99,
    "first_name": "Cammi",
    "last_name": "Romer",
    "email": "cromer2q@sphinn.com",
    "gender": "Female",
    "ip_address": "193.119.190.24"
}, {
    "id": 100,
    "first_name": "Lanny",
    "last_name": "Fishpoole",
    "email": "lfishpoole2r@meetup.com",
    "gender": "Female",
    "ip_address": "64.22.122.165"
}]

// for (let i = 0; i < data1.length; i++) {
//     document.write(data1[i]);
// }

data1.forEach((e, i) => {
    document.write(i + 1, "] First Name - ", JSON.stringify(e.first_name), " , Last Name - ", JSON.stringify(e.last_name));
    document.write("</br>");
});

// data1.forEach(
//     (e, i , a) => {
//         console.log("Element :", e, " Index :", i, " Array :", a);
//     }
// )


let arr2 = [70, 40, 10, 330, 660, 20, 50, 10]
// console.log(arr2.sort());
// console.log(arr2.sort((a, b) => {
//     return a - b
// }
// ));
// let newArr1 = arr2.sort((a, b) => {
//     return b - a
// }
// );
// console.log(newArr1);
// console.log(arr2);  // sort affects original array

// Q1 - can we return anything ?
// Q2 - if returning , returned value is in which format ?
// Q3 - are we modifying original array?

// let newArr2 = arr2.forEach(element => {
//     return element      
// });
// console.log(newArr2);   // undefined

let newArr3 = arr2.forEach((e)=>{
    console.log(e+30);
})