ALTER TABLE "ordermanage$order" RENAME TO "79c23815a1c94882be411498db09607f";
DROP SEQUENCE "ordermanage$order_ordernumber_mxseq";
DELETE FROM "mendixsystem$entity" 
 WHERE "id" = '195af409-394d-42b5-97b1-8de4691806a9';
DELETE FROM "mendixsystem$entityidentifier" 
 WHERE "id" = '195af409-394d-42b5-97b1-8de4691806a9';
DELETE FROM "mendixsystem$sequence" 
 WHERE "attribute_id" IN (SELECT "id"
 FROM "mendixsystem$attribute"
 WHERE "entity_id" = '195af409-394d-42b5-97b1-8de4691806a9');
DELETE FROM "mendixsystem$remote_primary_key" 
 WHERE "entity_id" = '195af409-394d-42b5-97b1-8de4691806a9';
DELETE FROM "mendixsystem$attribute" 
 WHERE "entity_id" = '195af409-394d-42b5-97b1-8de4691806a9';
CREATE TABLE "ordermanage$order" (
	"id" BIGINT NOT NULL,
	"orderno" INT NULL,
	"partno" VARCHAR_IGNORECASE(200) NULL,
	"product" VARCHAR_IGNORECASE(200) NULL,
	"groupname" VARCHAR_IGNORECASE(200) NULL,
	"setupstart" TIMESTAMP NULL,
	"starttime" TIMESTAMP NULL,
	"endtime" TIMESTAMP NULL,
	"quantity" INT NULL,
	"actualquantity" INT NULL,
	"acsetuptime" TIMESTAMP NULL,
	"acstarttime" TIMESTAMP NULL,
	"acendtime" TIMESTAMP NULL,
	"note" VARCHAR_IGNORECASE(200) NULL,
	"orderstatus" VARCHAR_IGNORECASE(11) NULL,
	PRIMARY KEY("id"));
INSERT INTO "mendixsystem$entity" ("id", 
"entity_name", 
"table_name", 
"remote", 
"remote_primary_key")
 VALUES ('c8c412a9-2e5a-4598-9064-78fc4bbda157', 
'OrderManage.Order', 
'ordermanage$order', 
false, 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('db7f12dc-7885-49c6-8810-f09097d7cbcf', 
'c8c412a9-2e5a-4598-9064-78fc4bbda157', 
'orderNo', 
'orderno', 
3, 
0, 
'0', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('7c0b7b33-43cc-4a21-9121-a5f9e476c3d3', 
'c8c412a9-2e5a-4598-9064-78fc4bbda157', 
'partNo', 
'partno', 
30, 
200, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('ab192ed6-4395-4a48-8d62-e0b63447f9ab', 
'c8c412a9-2e5a-4598-9064-78fc4bbda157', 
'product', 
'product', 
30, 
200, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('473894ee-bb5f-4b99-9e34-03da1a3c0ac8', 
'c8c412a9-2e5a-4598-9064-78fc4bbda157', 
'groupName', 
'groupname', 
30, 
200, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('a865778c-9929-466c-9c35-7a9000f53bbc', 
'c8c412a9-2e5a-4598-9064-78fc4bbda157', 
'setupStart', 
'setupstart', 
20, 
0, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('56f95754-fc67-4935-8548-6686aafce207', 
'c8c412a9-2e5a-4598-9064-78fc4bbda157', 
'startTime', 
'starttime', 
20, 
0, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('befd6228-434d-47d1-80a8-9062469a25a4', 
'c8c412a9-2e5a-4598-9064-78fc4bbda157', 
'endTime', 
'endtime', 
20, 
0, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('0c0c35d9-e140-48de-b9da-8d4c9dc09399', 
'c8c412a9-2e5a-4598-9064-78fc4bbda157', 
'quantity', 
'quantity', 
3, 
0, 
'0', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('507cd793-86a9-45f3-b519-a6acd827abe8', 
'c8c412a9-2e5a-4598-9064-78fc4bbda157', 
'actualQuantity', 
'actualquantity', 
3, 
0, 
'0', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('a3d4348c-d5da-41a3-91ef-6f914df84006', 
'c8c412a9-2e5a-4598-9064-78fc4bbda157', 
'acSetupTime', 
'acsetuptime', 
20, 
0, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('201f16e0-b9e8-4c5c-8718-08225f0af8da', 
'c8c412a9-2e5a-4598-9064-78fc4bbda157', 
'acStartTime', 
'acstarttime', 
20, 
0, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('040e02c6-18cc-4412-87cd-148b7dec94d1', 
'c8c412a9-2e5a-4598-9064-78fc4bbda157', 
'acEndTime', 
'acendtime', 
20, 
0, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('2bc93205-66c3-4a0e-b630-c76839f05fb4', 
'c8c412a9-2e5a-4598-9064-78fc4bbda157', 
'note', 
'note', 
30, 
200, 
'', 
false);
INSERT INTO "mendixsystem$attribute" ("id", 
"entity_id", 
"attribute_name", 
"column_name", 
"type", 
"length", 
"default_value", 
"is_auto_number")
 VALUES ('57fa836b-7d8b-4cf7-a072-b728e459b47c', 
'c8c412a9-2e5a-4598-9064-78fc4bbda157', 
'orderStatus', 
'orderstatus', 
40, 
11, 
'', 
false);
DROP TABLE "79c23815a1c94882be411498db09607f";
UPDATE "mendixsystem$version"
 SET "versionnumber" = '4.2', 
"lastsyncdate" = '20230531 09:08:23';
