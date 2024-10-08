

//!! Exception Handling

try {
    console.log(a);
} 
catch (err) {
    console.log(err);
}
//` If there is no error it will print undefined
//` If we try to print a variable which is not declared then it will throw an error and
//` will be caught by catch block
//` If variable a is not declared it will throw ReferenceError and will be caught by catch block

try {
    throw new Error("custom: a is not defined")
} 
catch (err) {
    console.log(err);
}

try {
    throw "custom: you are wrong"
} 
catch (err) {
    console.log(err);
}

try {
    throw "custom: you are wrong with exception"
} 
catch (err) {
    console.log(err);
}
finally{
    console.log("This is finally block");
}