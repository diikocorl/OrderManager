ALTER TABLE "ordermanage$order" ALTER COLUMN "orderno" SET DATA TYPE BIGINT;
CREATE SEQUENCE "ordermanage$order_orderno_mxseq" AS BIGINT START WITH 10;
INSERT INTO "mendixsystem$sequence" ("attribute_id", 
"name", 
"start_value", 
"current_value")
 VALUES ('c06c1853-5001-4e08-8ab2-b0cc1a844532', 
'ordermanage$order_orderno_mxseq', 
1, 
9);
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '195af409-394d-42b5-97b1-8de4691806a9', 
"attribute_name" = 'orderNo', 
"column_name" = 'orderno', 
"type" = 0, 
"length" = 0, 
"default_value" = '1', 
"is_auto_number" = true
 WHERE "id" = 'c06c1853-5001-4e08-8ab2-b0cc1a844532';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20230530 16:12:41';
