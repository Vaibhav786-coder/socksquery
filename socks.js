let count = 0;
n = window.prompt("enter the number");
s = window.prompt("enter the " + n + " elements");
var arr = (s.split(" "));
arr.sort();
console.log(arr);
let y = 0;
if (arr.length == n) {
    for (y = 0; y < n - 1; y++) {
        if (arr[y] == arr[y + 1]) {
            count++;
            y++;
        }
    }
    document.writeln("Number of pairs of socks can be used are " + count);
}
else {
    alert("Enter the correct (n) elements");
}



