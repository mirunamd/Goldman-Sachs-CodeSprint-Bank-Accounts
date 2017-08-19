# Goldman-Sachs-CodeSprint-Bank-Accounts

You are going to receive payments in the upcoming month. The payments are numbered from 0 to n-1 and pi denotes the amount of money in dollars that will be paid in connection with the i-th payment. Before receiving the payments, you have two banking options to consider:
 1. You can receive all the payments on your current bank account remembering that the bank charges you for each payment
i max(k, x% pi), where k and x are given.
 2. You can pay the bank d dollars upfront to open a new special account for which the bank doesn't charge you for any of the upcoming transactions.

Your task is to decide which of the above two options is more profitable to you. If both ways are equally profitable, then you prefer to be charged for each transaction.

For example, in the image below, 5 transactions are given namely 10, 20, 30, 30, 10. For k = 5 and x = 20, the two banking options are shown as follows. You can see that for this case, paying a fee is more profitable.

[10|20|30|20|10] -> (max 5, 20% ) [2|4|5|4|2] = 17 or (fixed 20) [20]

**Input Format**

In the first line, there is a single integer denoting the number of scenarios to handle. After that, descriptions of all these scenarios follow. In the first line of a single scenario, there are space-separated integers n, k, x, d. In the second line, there are space separated integers p0, p1, ..., pn-1.

**Constraints**
- 1 <= q <= 5
- 1 <= n <= 100
- 1 <= pi <= 1000
- 1 <= k <= 1000
- 1 <= x <= 100
- 1 <= d <= 10000

**Output Format**

Print exactly q lines. In the i-th of them, print the answer to the i-th scenario. More specifically, print fee if it's more profitable to use the current account and let the bank charge for each transaction, or print upfront if it's better to pay the bank up front for opening the new special account.

**Sampe Input**
> 3

> 3 20 10 60

> 100 200 300

> 3 20 15 120

> 200 250 300

> 1 1 10 100

> 1000

**Sample Output**

> upfront

> fee

> fee
