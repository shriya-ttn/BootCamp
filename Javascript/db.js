var db = [
    { Name: 'Shriya',Age:19, Salary: 9000,DOB: '12/1/2000' },
    { Name: 'Alok',Age:26, Salary: 4500,DOB: '15/3/1990' },
    { Name: 'Sri',Age:22, Salary: 8055,DOB: '2/7/1998' },
    { Name: 'Priya',Age:24, Salary: 7055,DOB: '18/8/1995' },
    { Name: 'tiya',Age:28, Salary: 425,DOB: '14/3/1994' },
    { Name: 'riya',Age:18, Salary: 200,DOB: '30/4/1995' },

];

var HighSal =  db.filter(function(db) {
	return db.Salary > 5000;});

let method1 = Object.assign({}, db);
let method2 = Object.assign({}, HighSal);

console.log(" ")
console.log("My database");
console.log(method1);

console.log(" ")
console.log("Salary Above 5k people");
console.log(method2);

var groups = {};
db.forEach(function(db) {
  var list = groups[db.Age];
  if (list) {
    list.push(db);
  } else {
    groups[db.Age] = [db];
  }
});

console.log(" ")
console.log("Group by Age");
console.log(groups);

/*
let increment=[];
var fetch =  db.filter(function(db) {
	if (db.Salary <1000 && db.Age>20) {
		db.Salary= + db.Salary
		let po = db.Salary *6;}
		return (po)	});


let methodfetch = Object.assign({}, fetch);

console.log(methodfetch);

*/
let increment = [];
for (let k = 0; k< db.length; k++){
if (db[k].Salary < 1000 && db[k].Age>20){
let po = db[k].Salary * 5;
let nn = db[k].Name
increment.push(nn,po);}}

console.log(" ")
console.log("Name and incremented salary");
console.log(increment);

