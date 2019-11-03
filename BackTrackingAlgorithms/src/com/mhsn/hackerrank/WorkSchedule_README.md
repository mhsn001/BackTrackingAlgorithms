## Work Schedule

>You just got a new job where you have to work exactly as many hours as you are told each week, working no more than a daily maximum number of hours per day. Some of the days, they tell you how many hours you will work. You get to choose the remainder of your schedule, within the limits.
>
>A completed schedule consists of exactly **7** digits in the range **0** to **8** representing each day's hours to be worked. You will get a pattern string similar to the schedule, but with some of the digits replaced by a question mark, **?, (ascii 63 decimal)**. Given a maximum number of hours you can work in a day, replace the question marks with digits so that the sum of the scheduled hours is exactly the hours you must work in a week. Return a string array with all possible schedules you can create, ordered lexicographically.
>
>For example, your partial schedule, **pattern = 08??840**, your required hours, **work_hours = 24**, and you can only work, at most, **day_hours = 4** hours per day during the two days in question. You have two days on which you must work **24 - 20 = 4** more hours for the week. All of your possible schedules are listed below:
>
><pre>
>08<span style="color:red;">04</span>840
>08<span style="color:red;">13</span>840
>08<span style="color:red;">22</span>840
>08<span style="color:red;">31</span>840
>08<span style="color:red;">40</span>840
></pre>
>
>
>### Function Description
>Complete the function **findSchedules** in the editor below. The function must return an array of strings that represents all possible valid schedules. The strings must be ordered lexicographically.
>
>findSchedules has the following parameter(s):
>
>**work_hours:** an integer that represents the hours you must work in the week
>
>**day_hours:** an integer that represents the maximum hours you may work in a day
>
>**pattern:** a string that represents the partially completed schedule
>
>### Constraints
>
>- **1 ≤ work_hours ≤ 56**
>- **1 ≤ day_hours ≤ 8**
>- **| pattern | = 7**
>- Each character of **pattern** ∈ **{0, 1,...,8}**
>- There is at least one correct schedule.
>
>
>### Input Format For Custom Testing
>
>The first line contains an integer, **work_hours**
>The second line contains an integer, **day_hours**
>The third line contains a string, **pattern**
>
>### Sample Case 0</summary>
>
>Sample Input 0
>
>```
>56
>8
>???8???
>```
>
>Sample Output 0
>```
>8888888
>```
>
>Explanation 0
>```
>work_hours = 56
>day_hours = 8
>pattern = ???8???
>```
>
>There is only one way to work **56** hours in **7** days of **8** hours.
>
>Sample Case 1
>
>Sample Input 1
>```
>3
>2
>??2??00
>```
>
>Sample Output 1
>```
>0020100
>0021000
>0120000
>1020000
>```
>
>Explanation 1
>```
>work_hours = 3
>day_hours = 2
>pattern = ??2??00
>```
>
>You only need to schedule **1** more hour for the week, and it can be on any one of the days in question.
