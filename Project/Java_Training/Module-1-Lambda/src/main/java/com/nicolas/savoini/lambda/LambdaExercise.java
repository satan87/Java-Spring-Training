package com.nicolas.savoini.lambda;

public class LambdaExercise {




    /*
    var foodArray = ['Apples', 'Peaches', 'Strawberries', 'Corn'];

const food = () => {
  document.getElementById('food').innerHTML = foodArray;
};

// METHOD 1
console.log('***** Method 1 *****');
console.log('Apples');
console.log('Peaches');

//------------------------------------
// METHOD 2
console.log('\n***** Method 2 *****');
//--
for (var index = 0; index < foodArray.length; index++) {
  console.log(foodArray[index]);
}


for (var index = 0; index < foodArray.length; index = index + 2) {
  console.log(foodArray[index]);
}

for (var index = foodArray.length - 1; index >= 0; index--) {
  console.log(foodArray[index]);
}


//------------------------------------
// METHOD 3
console.log('\n***** Method 3 *****');
    //--
    var returned = foodArray.forEach((element) => console.log(element));
console.log('return is ' + returned);


foodArray.forEach((element, index) => {
  return (foodArray[index] = element.toUpperCase());
});
console.log(foodArray);


//------------------------------------
// METHOD 4
//console.log('\n***** Method 4 *****');
//    //--
//    var resm1 = foodArray.map((element) => console.log(element));
//console.log(resm1);
//
//    var foodArrayUpperCase = foodArray.map((element) => element.toUpperCase());
//
//console.log(foodArrayUpperCase);
//console.log(foodArray);
//
//    toUpper = function (x) {
//        return x.toUpperCase();
//    };
//console.log(foodArray.map(toUpper));

//------------------------------------
// METHOD 5
console.log('\n***** Method 5 *****');
//--
//Je veux afficher les FL de plus de 6 characteres

    SixAndMore = function (fl) {
        return fl.length > 6;
    };
    var foodSixChars = foodArray.filter(SixAndMore).map(toUpper);

console.log(foodSixChars);

//------------------------------------
// METHOD 6
console.log('\n***** Method 6 *****');
// REDCUCE -> 1 seule valeur
// Combien j'ai de lettre dans mon tableau
//REDUCE : 3 Choses : Point de depart, sous-total,  valeur a utiliser dans le calcul

const reducer = (accumulator, currentValue) => accumulator + currentValue;
    var lettres = foodArray.map((e) => e.length).reduce(reducer, 0);
console.log(foodArray.map((e) => e.length));
console.log(lettres);
console.log(
        foodArray
                .filter(SixAndMore)
            .map((e) => e.length)
            .reduce(reducer, 0),
);

// METHOD 7
console.log('\n***** Method 7 *****');
    //--
    var flatten = [
            [1, 2],
            [3, 4],
            ].flatMap((x) => x);
console.log(flatten);

    var flatten2 = [
            [[1], [2]],
            [[3], [4]],
            ].flatMap((x) => x);
console.log(flatten2);

     */
}
