// 1. Take a sentence as an input and reverse every word in that sentence.
// Example - This is a sunny day > shiT si a ynnus yad.

function reverseWords(sentence) {
  const words = sentence.split(" ");
  const reversedWords = words.map((word) => {
    return word.split("").reverse().join("");
  });
  const reversedSentence = reversedWords.join(" ");

  return reversedSentence;
}

const inputSentence = "This is a sunny day";
const reversedSentence = reverseWords(inputSentence);
console.log(reversedSentence);

// 2. Perform sorting of an array in descending order.

function sortArrayDesc(arr) {
  arr.sort((a, b) => b - a);
  return arr;
}
const numbers = [4, 2, 9, 1, 5];
const sortedDescending = sortArrayDesc(numbers);
console.log(sortedDescending);
