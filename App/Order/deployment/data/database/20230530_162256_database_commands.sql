ALTER TABLE "ordermanage$order" DROP COLUMN "orderno";
ALTER TABLE "ordermanage$order" ADD "orderno" INT NULL;
UPDATE "ordermanage$order"
 SET "orderno" = 0;
DELETE FROM "mendixsystem$attribute" 
 WHERE "id" = 'c06c1853-5001-4e08-8ab2-b0cc1a844532';
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('1df9d797-65cc-445b-a168-2f15904d86a1', 
'195af409-394d-42b5-97b1-8de4691806a9', 
'orderNo', 
'orderno', 
3, 
0, 
'0', 
false);
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20230530 16:22:56';
