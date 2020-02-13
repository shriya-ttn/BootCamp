let obj = {
  name: 'Shriya-File',
  exec: function exec() {
    return true;
  },
}

let method1 = Object.assign({}, obj);
let method2 = JSON.parse(JSON.stringify(obj));

console.log(method1);
console.log(method2);

 //Object.assign({}, obj)
/* result
{
  exec: function exec() {
    return true;
  },
  name: "scotch.io"
}
*/

 // JSON.parse(JSON.stringify(obj))
/* result
{
  name: "scotch.io"
}
*/