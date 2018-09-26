# JavaDataStructure
2018.9-2019.1 Data Structure and Algorithm Code Repository

You can use these to do f**king anything you want. 
# 数据结构与算法

## 汉诺塔

### 思路
声明一个方法将n个盘子借助C从A移动到B的过程输出，主要通过三个步骤实现（盘子1~n大小依次递增，1最小，n最大）：
-  将除第n个盘子外的n-1个盘子从A移动到C
-  将第n个盘子个盘子从A移动到B
-  将除第n个盘子外的n-1个盘子从C移动到B  

移动n-1个盘子时递归调用该方法即可，当n=1时，直接将其移动到目标位置。  
### 代码
```
moveDISKs(int n, char A, char B, char C) {
        if (n==1)
            输出("将1从A移动到B");
        else{
            moveDISKs(n-1, A, C, B);
            输出("将n从A移动到B");
            moveDISKs(n-1, C, B, A);
        }
    }
```
### 输入输出范例  
>Please enter number of disks:
>**3**
>The progress from A to B is:
>Move disk 1 from A to B
>Move disk 2 from A to C
>Move disk 1 from B to C
>Move disk 3 from A to B
>Move disk 1 from C to A
>Move disk 2 from C to B
>Move disk 1 from A to B
>Quit?(y/n):
>**y**


## 数字组合
### 思路
声明一个函数，维护一个输出数组，记录输出数组中已有的数字个数，依次返回数字a\~n之间的数字，若返回a，则将a加入待输出数组，已记录数字个数加1，再从a+1~n个数字中选取下一个数字，以此类推。若输出数字已满则输出数组。
### 代码
```
void combination(int[] ans, int begin, int nums, int N, int R){
        for(int i=begin;i<=N;i++) {
            if (i+R-nums-1>N)
                return;     # 剩余数字个数不足
            ans[nums]=i;    # 将i加入到输出数组
            if (nums+1==R)  # 输出数组已满
                输出 ans; 
            else            # 否则从i+1~N中选取数字继续添加
                combination(ans, i+1, nums+1, N, R);
        }
```
### 输入输出范例
>Please input number of N: 
>**5**
>Please input number of R: 
>**3**
>1 2 3 
>1 2 4 
>1 2 5 
>1 3 4 
>1 3 5 
>1 4 5 
>2 3 4 
>2 3 5 
>2 4 5 
>3 4 5 
>Quit? (y/n): 
>**y**

## 约瑟夫问题
### 思路
维护一个链表（数组），链表（数组）中记录未离开的人的序号。以M为步长选取下一个离开的人，期间若到达链表（数组）的末尾，则重新回到头部，直到链表（数组）中剩余个数为1，输出其序号。
### 输入输出范例
>Please input number of people N: 
>**5**
>Please input step size M: 
>**3**
>Person 3 leave.
>Person 1 leave.
>Person 5 leave.
>Person 2 leave.
>Winner is: person 4
>Quit? (y/n)
>y

注：输入数字为正整数，且M<N。

## 多项式相加
### 思路
给定一个多项式字符串，按照运算符+/-将其划分，如划分-5x^4+2x-4得到["-5x^4", "2x", "-4"]，然后对每一项再次划分得到其系数与指数，按照指数大小顺序由大到小依次加入链表，链表每个节点的数字域保存系数与指数两个数。按此过程得到两个多项式链表，再将两个链表相加，同时从头结点遍历，指数项相同时系数相加，**若系数和不为零**则添加到结果链表；若a链表当前结点的指数大于b链表当前结点，则将a链表当前结点直接添加到结果链表并取下一结点；若一个链表遍历结束后另一个还未结束，则将未结束链表的剩余结点直接添加到结果链表。
### 输入输出范例
>Please input first polynomial:
>**x\^3+4x\^2+9x**
>Please input second polynomial:
>**-x\^3.5-6.8x\^2+5**
>The addition result:
>**-x\^3.5+x\^3.0-2.8x\^2.0+9.0x+5.0**
>Quit? (y/n)
>**y**

注意：输入字符串中指数由前到后依次递减，系数、指数均可为小数，系数为负时直接将前面的运算符改为-，不必添加括号如6x^2+(-2)x可直接写为6x\^2-2x。

## 前缀表达式直接求和
### 思路
