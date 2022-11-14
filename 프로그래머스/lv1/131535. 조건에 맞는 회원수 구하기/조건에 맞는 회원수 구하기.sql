-- 코드를 입력하세요
SELECT count(*) "USERS"
from user_info
where DATE_FORMAT(joined,'%Y') = '2021' and age between 20 and 29;