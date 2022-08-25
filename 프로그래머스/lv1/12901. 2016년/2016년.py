import datetime as dt
def solution(a, b):
    day = ['MON','TUE','WED','THU','FRI','SAT','SUN']
    x = dt.date(2016,a,b).weekday()
    answer = day[x]
    return answer