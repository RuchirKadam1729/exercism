-- Schema: CREATE TABLE "twofer" ("input" TEXT, "response" TEXT);
-- Task: update the twofer table and set the response based on the input.
update twofer
set response = CONCAT('One for ',case when length(input) > 0 then input else 'you' end,', one for me.')