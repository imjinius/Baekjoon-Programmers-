-- 코드를 입력하세요
SELECT member_id, member_name, gender, date_format(date_of_birth,'%Y-%m-%d') "date_of_birth"
from member_profile
where month(date_of_birth) = "3" && tlno is not null && gender = "w"
order by member_id;