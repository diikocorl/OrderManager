ALTER TABLE "ordermanage$order" DROP COLUMN "orderno";
DROP SEQUENCE "ordermanage$order_orderno_mxseq";
ALTER TABLE "ordermanage$order" ADD "orderno" INT NULL;
UPDATE "ordermanage$order"
 SET "orderno" = 0;
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" = '1df9d797-65cc-445b-a168-2f15904d86a1';
UPDATE "mendixsystem$attribute"
 SET "entity_id" = '195af409-394d-42b5-97b1-8de4691806a9', 
"attribute_name" = 'orderNo', 
"column_name" = 'orderno', 
"type" = 3, 
"length" = 0, 
"default_value" = '0', 
"is_auto_number" = false
 WHERE "id" = '1df9d797-65cc-445b-a168-2f15904d86a1';
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20230531 08:59:38';
