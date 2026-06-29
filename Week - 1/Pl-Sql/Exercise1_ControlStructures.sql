-- Scenario 1
-- Apply 1% discount to loan interest rates for customers above 60 years of age
BEGIN
    UPDATE Customers
    SET LoanInterestRate = LoanInterestRate - 1
    WHERE Age > 60;
    DBMS_OUTPUT.PUT_LINE('Interest discount applied successfully.');
END;
/
-- Scenario 2
-- Promote customers to VIP if balance is greater than 10000
BEGIN
    UPDATE Customers
    SET IsVIP = 'TRUE'
    WHERE Balance > 10000;
    DBMS_OUTPUT.PUT_LINE('VIP status updated successfully.');
END;
/
-- Scenario 3
-- Print reminder for loans due within next 30 days
DECLARE
    CURSOR loan_cursor IS
        SELECT CustomerName,
               DueDate
        FROM Loans
        WHERE DueDate <= SYSDATE + 30;
BEGIN
    FOR loan_record IN loan_cursor LOOP

        DBMS_OUTPUT.PUT_LINE(
            'Reminder : '
            || loan_record.CustomerName
            || ' - Loan Due on '
            || loan_record.DueDate
        );
    END LOOP;
END;
/