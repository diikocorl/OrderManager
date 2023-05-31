ALTER TABLE "ordermanage$order" ALTER COLUMN "orderno" SET DATA TYPE BIGINT;
CREATE SEQUENCE "ordermanage$order_orderno_mxseq" AS BIGINT START WITH 1;
INSERT INTO "mendixsystem$sequence" ("attribute_id", 
"name", 
"start_value", 
"current_value")
 VALUES ('1df9d797-65cc-445b-a168-2f15904d86a1', 
'ordermanage$order_orderno_mxseq', 
1, 
0);
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '195af409-394d-42b5-97b1-8de4691806a9', 
"attribute_name" = 'orderNo', 
"column_name" = 'orderno', 
"type" = 0, 
"length" = 0, 
"default_value" = '1', 
"is_auto_number" = true
 WHERE "id" = '1df9d797-65cc-445b-a168-2f15904d86a1';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20230531 08:57:54';
