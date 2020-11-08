## Part 1: Test it with SQL
id int
name varchar
employer varchar
skill varchar

## Part 2: Test it with SQL
SELECT name
FROM techjobs.employer
WHERE location = "St. Louis";

## Part 3: Test it with SQL
DROP TABLE `techjobs`.`job`;

## Part 4: Test it with SQL

SELECT name, description
FROM skill
WHERE id IN (SELECT skills_id FROM job_skills)
ORDER BY name;