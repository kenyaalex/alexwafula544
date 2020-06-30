const { compareSync } = require("bcryptjs");

const companies = [
    { name: "company one", category: "ict", start: 1990, end: 2020 },
    { name: "company two", category: "finance", start: 1990, end: 2020 },
    { name: "company three", category: "hr", start: 1990, end: 2020 },
    { name: "company four", category: "account", start: 1990, end: 2020 },
    { name: "company five", category: "ledger", start: 1990, end: 2020 },
    { name: "company six", category: "copyright", start: 1990, end: 2020 },
    { name: "company seven", category: "retail", start: 1990, end: 2020 },
    { name: "company eight", category: "security", start: 1990, end: 2020 },
    { name: "company nine", category: "admin", start: 1990, end: 2020 },
];
const ages = [12, 34, 56, 7, 8, 9, 3, 23, 14, 34, 56, 7, 45]
for (let x = 0; x < companies.length; x++) {
    console.log(companies[x]);
}
//map
//for each
//map
//filter
//sort
//reduce
//1 for each
/*companies.forEach(function(company) {
console.log(company)
});*/
//filter using for loop
/*
let alex = [];
for (x = 0; x < ages.length; x++) {
    if (ages[x] >= 21) {
        alex.push(ages[x])

}

}
console.log(alex);*/
/*const alex = ages.filter(function(ages) {
if (ages >= 21) {
    return true;
}
});*/
const alex = ages.filter(ages => ages >= 21);
console.log(alex);
//filter retails

/*const retailCompany = companies.filter(function(companies) {
if (companies.category == 'retail') {
    return true;
}
});
console.log(retailCompany);*/