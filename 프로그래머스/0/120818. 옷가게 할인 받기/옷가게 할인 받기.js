1
2
3
4
5
6
7
8
9
10
11
12
13
function solution(price) {
    var answer = price;
    if (answer >= 500000) {
        answer *= 0.8;
    } else if (answer >= 300000) {
        answer *= 0.9;
    } else if (answer >= 100000) {
        answer *= 0.95;
    }

    return parseInt(answer);
}